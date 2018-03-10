package ru.geekbrains.stargame.engine.JSONEngine.generator;

import java.util.Map;

/**
 * Created by sol on 3/7/18.
 */

public class Menu extends Base{
    public Menu(){
        super();
    }

    public Menu(String name, String[] atlas, String[] texture, Map<String, String> font, String[] music, String[] sound) {
        super(name, atlas, texture, font, music, sound);
    }
}
