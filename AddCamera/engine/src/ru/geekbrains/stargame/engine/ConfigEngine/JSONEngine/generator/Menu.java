package ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator;

import java.util.Map;

/**
 * @author Shuttle on 3/7/18.
 */

public class Menu extends Base{
    public Menu(){
        super();
    }

    public Menu(String name, String[] atlas, String[] texture, String[] font, String[] music, String[] sound) {
        super(name, atlas, texture, font, music, sound);
    }
}
