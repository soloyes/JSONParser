package ru.geekbrains.stargame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.stargame.engine.ActionListener;
import ru.geekbrains.stargame.engine.Base2DScreen;
import ru.geekbrains.stargame.engine.Sprite;
import ru.geekbrains.stargame.engine.math.Rnd;

/**
 * Created by raultaylor.
 */

public class MenuScreen extends Base2DScreen implements ActionListener {

    private float currentScale = 1f;
    private Texture texture;
    private TextureAtlas atlas;
    private Sprite[] sprites = new Sprite[10];
    private Sprite target;

    @Override
    public void actionPerformed(Object src) {
        
    }

    public MenuScreen(Game game) {
        super(game);
    }


    @Override
    public void show() {
        super.show();
        texture = new Texture("badlogic.jpg");
        atlas = new TextureAtlas("mainAtlas.tpack");
        for(int i=0;i<sprites.length;i++){
            sprites[i] = new Sprite(new TextureRegion(texture));
            sprites[i].setHeightProportion(Rnd.nextFloat(0.5f,2.5f));
            sprites[i].pos.set(Rnd.nextFloat(-10f,10f),Rnd.nextFloat(-10f,10f));
            camera.addVisualObject(sprites[i]);
        }

        target = new Sprite(atlas.findRegion("main_ship"));
        target.setHeightProportion(0.3f);
        camera.addVisualObject(target);
        camera.setTarget(target);
    }



    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public boolean keyDown(int keycode) {

        if(Input.Keys.RIGHT == keycode){
            target.pos.set(target.pos.x+0.05f, target.pos.y);
            System.out.println(target.pos);
            System.out.println(sprites[0].pos);
        }
        if(Input.Keys.LEFT == keycode){
            target.pos.set(target.pos.x-0.05f, target.pos.y);
            System.out.println(target.pos);
            System.out.println(sprites[0].pos);
        }
        if(Input.Keys.UP == keycode){
            target.pos.set(target.pos.x, target.pos.y+0.05f);
            System.out.println(target.pos);
            System.out.println(sprites[0].pos);
        }
        if(Input.Keys.DOWN == keycode){
            target.pos.set(target.pos.x, target.pos.y-0.05f);
            System.out.println(target.pos);
            System.out.println(sprites[0].pos);
        }


        System.out.println(keycode);
        return super.keyDown(keycode);


    }

    @Override
    public boolean keyUp(int keycode) {

        if(keycode == 51){
            currentScale *=1.1f;
            camera.setScale(currentScale);
        }
        if(keycode == 47){
            currentScale *=0.9f;
            camera.setScale(currentScale);
        }
        return super.keyUp(keycode);


    }
}
