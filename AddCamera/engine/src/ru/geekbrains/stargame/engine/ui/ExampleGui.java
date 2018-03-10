package ru.geekbrains.stargame.engine.ui;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.stargame.engine.Sprite;
import ru.geekbrains.stargame.engine.math.Rect;

/**
 * Created by raultaylor.
 */

public class ExampleGui extends Sprite implements  GuiVisualObject {

    public ExampleGui(TextureAtlas atlas) {
        super(atlas.findRegion("touchpad_center"));
        setSize(0.5f,0.5f);
        pos.set(0.5f,0.2f);
    }

    @Override
    public Rect getRect() {
        return this;
    }
}
