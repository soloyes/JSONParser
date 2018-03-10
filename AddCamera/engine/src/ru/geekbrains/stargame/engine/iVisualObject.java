package ru.geekbrains.stargame.engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.geekbrains.stargame.engine.math.Rect;

/**
 * Created by raultaylor.
 */

public interface iVisualObject {

    void draw(SpriteBatch batch);
    Rect getRect();

}
