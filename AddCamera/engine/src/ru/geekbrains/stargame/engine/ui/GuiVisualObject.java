package ru.geekbrains.stargame.engine.ui;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.geekbrains.stargame.engine.math.Rect;

/**
 * Created by raultaylor.
 */

public interface GuiVisualObject {

    void draw(SpriteBatch batch);
    Rect getRect();

}
