package ru.geekbrains.stargame.engine.JSONEngine.generator;

import java.util.Map;

/**
 * Created by sol on 3/7/18.
 */

public class World extends Base{
    public World(){
        super();
    }

    public World(String name, String[] atlas, String[] texture, Map<String, String> font, String[] music, String[] sound) {
        super(name, atlas, texture, font, music, sound);
    }
}
