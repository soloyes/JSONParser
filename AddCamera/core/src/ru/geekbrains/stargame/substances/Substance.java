package ru.geekbrains.stargame.substances;

import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.stargame.engine.math.Circle;
import ru.geekbrains.stargame.engine.pool.Exterminable;
import ru.geekbrains.stargame.engine.Linkable;

/**
 * Created by raultaylor.
 */

public class Substance extends Circle implements Exterminable, Linkable{

    private boolean isDestroyed = false;
    protected int weight;
    protected float volume;
    private String myType;

    public Substance(){
        super();
        pos.set(0,0);
        weight = 1;
        volume = 1;
        size = (float)(1.0/(2*Math.PI));
    }

    protected void calcSize(){
        size = (float)(Math.exp(Math.log(volume)/3));

    }

    public void set(Vector2 pos, int weight, float density, String myType){
        this.pos.set(pos);
        this.volume = weight/density;
        this.weight = weight;
        this.myType = myType;
        calcSize();
    }

    public int getWeight(){
        return this.weight;
    }

    public float getVolume(){
        return this.volume;
    }

    @Override
    public boolean isDestroyed() {
        return isDestroyed;
    }

    @Override
    public void setDestroyed(boolean flag) {
        this.isDestroyed = flag;
    }

    @Override
    public String getNameType() {
        return myType;
    }
}
