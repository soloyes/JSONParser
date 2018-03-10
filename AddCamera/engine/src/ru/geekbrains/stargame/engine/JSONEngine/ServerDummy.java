package ru.geekbrains.stargame.engine.JSONEngine;

import java.util.HashMap;
import java.util.Map;

import ru.geekbrains.stargame.engine.JSONEngine.generator.Advertising;
import ru.geekbrains.stargame.engine.JSONEngine.generator.Menu;
import ru.geekbrains.stargame.engine.JSONEngine.generator.Notification;
import ru.geekbrains.stargame.engine.JSONEngine.generator.World;
import ru.geekbrains.stargame.engine.JSONEngine.server.JSONCreateBase;

/**
 * Created by sol on 3/7/18.
 */

public class ServerDummy extends JSONCreateBase {
    @Override
    public Advertising[] setAdvertising() {
        Map<String, String> font = new HashMap<String, String>();
        font.put("fonts/font.fnt", "fonts/font.png");
        return new Advertising[]{
                new Advertising("Advertise1",
                new String[]{"atlases/mainAtlas.atlas"},
                new String[]{"textures/texture.png"},
                font,
                new String[]{"music/menu.ogg"},
                new String[]{"sounds/menu.ogg"})};
    }

    @Override
    public String[] setFolderTree() {
        Map<String, String> font = new HashMap<String, String>();
        font.put("fonts/font.fnt", "fonts/font.png");
        return new String[]{"fonts, atlases, textures, music, sounds"};
    }

    @Override
    public Menu[] setMenus() {
        Map<String, String> font = new HashMap<String, String>();
        font.put("fonts/font.fnt", "fonts/font.png");
        return new Menu[]{
                new Menu("Menu1",
                        new String[]{"atlases/mainAtlas.atlas"},
                        new String[]{"textures/texture.png"},
                        font,
                        new String[]{"music/menu.ogg"},
                        new String[]{"sounds/menu.ogg"})};
    }

    @Override
    public World[] setWorlds() {
        Map<String, String> font = new HashMap<String, String>();
        font.put("fonts/font.fnt", "fonts/font.png");
        return new World[]{
                new World("World1",
                        new String[]{"atlases/mainAtlas.atlas"},
                        new String[]{"textures/texture.png"},
                        font,
                        new String[]{"music/menu.ogg"},
                        new String[]{"sounds/menu.ogg"})};
    }

    @Override
    public Notification[] setNotifications() {
        Map<String, String> font = new HashMap<String, String>();
        font.put("fonts/font.fnt", "fonts/font.png");
        return new Notification[]{
                new Notification("Notification1",
                        new String[]{"atlases/mainAtlas.atlas"},
                        new String[]{"textures/texture.png"},
                        font,
                        new String[]{"music/menu.ogg"},
                        new String[]{"sounds/menu.ogg"})};
    }
}
