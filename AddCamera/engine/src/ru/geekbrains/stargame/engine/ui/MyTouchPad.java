package ru.geekbrains.stargame.engine.ui;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.stargame.engine.Movable;
import ru.geekbrains.stargame.engine.Sprite;
import ru.geekbrains.stargame.engine.math.Rect;

/**
 * Created by raultaylor.
 */

public class MyTouchPad extends Rect implements GuiVisualObject {

    public static final byte ONBOARD_STYLE = 1;
    public static final byte INSIDE_STYLE = 2;
    public static final byte OUTSIDE_STYLE = 3;

    public static final byte FIX_4_POSITIONS = 1;
    public static final byte FIX_8_POSITIONS = 2;
    public static final byte NO_FIX_POSITIONS = 3;

    public static final byte LINEAR_FORCE_CONTROL = 1;
    public static final byte PROGRESSIVE_FORCE_CONTROL = 3;
    public static final byte OFF_FORCE_CONTROL = 3;

    public static final byte FIX_ON_SCREEN = 1;
    public static final byte ON_CLICK_SCREEN = 2;

    private final float FULL_SIZE = 0.2f;
    private final float DEAD_ZONE = 0.3f;
    private final float SIZE_CENTER = 0.5f;

    private Movable link = null;

    public Sprite center;
    public Sprite zone;

    private float deadZone;
    private float sizeCenter;
    private byte forceControle;
    private byte onScreen;
    private byte fixPosition;

    private boolean hide = true;
    private byte currentStyle;
    private float maxOffsetCenter;

    private int currentPointer = -1;
    private Vector2 currentDirection = new Vector2();
    private Vector2 currentPosCenter = new Vector2();

    public MyTouchPad(TextureAtlas atlas, byte styleType){
        center = new Sprite(atlas.findRegion("touchpad_center"));
        zone = new Sprite(atlas.findRegion("touchpad_zone"));
        setStyle(styleType);
        this.setSize(FULL_SIZE);
    }

    public void setLink(Movable link){
        this.link = link;
    }

    private void controleLink(){
        if(link != null){
            link.move(getDirection());
        }
    }


    public void setSize(float size) {
        center.setSize(size*SIZE_CENTER, size*SIZE_CENTER);
        zone.setSize(size, size);
        super.setSize(size, size);
        setStyle(currentStyle);
    }

    public void touchDown(int x, int y, int pointer){
        if(currentPointer == -1){
            hide = false;
            currentPointer = pointer;
            this.pos.set(GuiHandler.getGuiPosition(x,y));
            zone.pos.set(this.pos);
            center.pos.set(this.pos);
            //controleLink();
        }
    }

    public void touchUp(int x, int y, int pointer){
        if(currentPointer == pointer){
            currentDirection.set(0,0);
            hide = true;
            currentPointer = -1;
            controleLink();
        }
    }

    public void setStyle(byte styleType){
        currentStyle = styleType;
        switch (styleType) {
            case ONBOARD_STYLE:
                maxOffsetCenter = this.getHalfHeight();
                break;
            case INSIDE_STYLE:
                maxOffsetCenter = this.getHalfHeight() - center.getHalfHeight();
                break;
            case OUTSIDE_STYLE:
                maxOffsetCenter = this.getHalfHeight() + center.getHalfHeight();
        }
    }

    public void touchDragged(int x, int y, int pointer){
        if(currentPointer == pointer){
            currentDirection.set(GuiHandler.getGuiPosition(x,y));
            currentDirection.sub(this.pos);
            if(currentDirection.len()>DEAD_ZONE*this.getHalfHeight()) {
                currentDirection.nor();
                currentPosCenter.set(this.pos).mulAdd(currentDirection, maxOffsetCenter);
                center.pos.set(this.currentPosCenter);
            }else{
                currentDirection.set(0,0);
                center.pos.set(this.pos);
            }
            controleLink();
        }
    }

    public Vector2 getDirection(){
        return currentDirection;
    }




    @Override
    public void draw(SpriteBatch batch) {
        if(!hide) {
            zone.draw(batch);
            //System.out.println("draw TouchPad_Zone: "+ zone.pos + " size: " + zone.getHeight()+ " : " + zone.getWidth());
            center.draw(batch);
            //System.out.println("draw TouchPad_Center: "+ center.pos + " size: " + center.getHeight()+ " : " + center.getWidth());
        }
    }



    @Override
    public Rect getRect() {
        return this;
    }
}
