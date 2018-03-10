package ru.geekbrains.stargame.visual;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.stargame.engine.Linkable;
import ru.geekbrains.stargame.engine.Sprite;
import ru.geekbrains.stargame.engine.iVisualObject;
import ru.geekbrains.stargame.engine.pool.Exterminable;

/**
 * Created by raultaylor.
 */

public class VisualObject extends Sprite implements Exterminable, iVisualObject {

    private boolean isDestroyed = true;
    private Linkable myLink;

    public VisualObject() {
        super();
    }

    public void set(Linkable link, TextureAtlas atlas){
        setDestroyed(false);
        myLink = link;
        regions[0] = atlas.findRegion(myLink.getNameType());
        update();
    }

    public void update(){
        if(myLink == null){
            setDestroyed(true);
        }else {
            setSize(myLink.getSize() * 2, myLink.getSize() * 2);
            pos.set(myLink.getPos());
        }

    }

    @Override
    public boolean isDestroyed() {
        return isDestroyed;
    }

    @Override
    public void setDestroyed(boolean flag) {
        if(flag){
            this.isDestroyed = flag;
            myLink = null;
        }
    }


    public Linkable getLink(){
        return myLink;
    }
}
