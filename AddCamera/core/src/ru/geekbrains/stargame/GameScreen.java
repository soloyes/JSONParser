package ru.geekbrains.stargame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.stargame.engine.Base2DScreen;
import ru.geekbrains.stargame.engine.ui.MyTouchPad;
import ru.geekbrains.stargame.player.Player;
import ru.geekbrains.stargame.visual.VisualData;
import ru.geekbrains.stargame.world.World;

/**
 * Created by raultaylor.
 */

public class GameScreen extends Base2DScreen {
    public GameScreen(Game game) {
        super(game);
    }

    private TextureAtlas atlas;
    private World world;

    private Player player;
    private VisualController visualController;
    private VisualData visualData;


    private MyTouchPad myTouchPad;


    private void init(){
        atlas = new TextureAtlas("solarisAtlas.tpack");
        visualData = new VisualData();


        world = new World(visualData);
        player = new Player();
        player.set(new Vector2(0,0),10,1.0f,"player");
        player.setSpeed(25f);

        world.addPlayer(player);




        visualController = new VisualController(visualData);

        myTouchPad = new MyTouchPad(atlas, MyTouchPad.INSIDE_STYLE);
        myTouchPad.setLink(player);

        camera.addGuiVisualObject(myTouchPad);





    }





    @Override
    public void show() {
        this.init();
        super.show();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        myTouchPad.touchDown(screenX,screenY,pointer);
        return super.touchDown(screenX, screenY, pointer, button);
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        myTouchPad.touchUp(screenX,screenY,pointer);
        return super.touchUp(screenX, screenY, pointer, button);
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        myTouchPad.touchDragged(screenX,screenY,pointer);
        return super.touchDragged(screenX, screenY, pointer);
    }

    @Override
    public void render(float delta) {

        world.updateWorld();
        player.update(delta);
        world.getNewData();

        //visualController.updateObjects();
        visualController.addOnCamera(camera);
        camera.setTarget(visualController.findAndGetPlayer());
        //System.out.println(visualController.findAndGetPlayer());
        super.render(delta);
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
