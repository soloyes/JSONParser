package ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator;

import java.util.Map;

/**
 * @author Shuttle on 3/7/18.
 */

public class Advertising extends Base {
    public Advertising(){
        super();
    }

    public Advertising(String name, String[] atlas, String[] texture, Map<String, String> font, String[] music, String[] sound) {
       super(name, atlas, texture, font, music, sound);
    }
}