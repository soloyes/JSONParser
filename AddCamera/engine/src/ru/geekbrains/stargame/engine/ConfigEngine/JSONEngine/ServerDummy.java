package ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Advertising;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Menu;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Notification;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.World;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.server.JSONCreateBase;

/**
 * @author Shuttle on 3/7/18.
 */

public class ServerDummy extends JSONCreateBase {
    @Override
    public Advertising[] setAdvertising() {
        return new Advertising[]{
                new Advertising("Advertise1",
                new String[]{"atlases/mainAtlas.atlas"},
                new String[]{"textures/texture.png"},
                new String[]{"fonts/font.fnt"},
                new String[]{"music/menu.ogg"},
                new String[]{"sounds/menu.ogg"})};
    }

    @Override
    public String[] setFolderTree() {
        return new String[]{"fonts", "atlases", "textures", "music", "sounds"};
    }

    @Override
    public Menu[] setMenus() {
        return new Menu[]{
                new Menu("Menu1",
                        new String[]{"atlases/mainAtlas.atlas"},
                        new String[]{"textures/texture.png"},
                        new String[]{"fonts/font.fnt"},
                        new String[]{"music/menu.ogg"},
                        new String[]{"sounds/menu.ogg"})};
    }

    @Override
    public World[] setWorlds() {
        return new World[]{
                new World("World1",
                        new String[]{"atlases/mainAtlas.atlas"},
                        new String[]{"textures/texture.png"},
                        new String[]{"fonts/font.fnt"},
                        new String[]{"music/menu.ogg"},
                        new String[]{"sounds/menu.ogg"})};
    }

    @Override
    public Notification[] setNotifications() {
        return new Notification[]{
                new Notification("Notification1",
                        new String[]{"atlases/mainAtlas.atlas"},
                        new String[]{"textures/texture.png"},
                        new String[]{"fonts/font.fnt"},
                        new String[]{"music/menu.ogg"},
                        new String[]{"sounds/menu.ogg"})};
    }
}
