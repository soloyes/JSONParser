package ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Advertising;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Menu;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Notification;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.World;

/**
 * @author Shuttle on 3/7/18.
 *
 * Media is base container of all other configuration data. If we need to extend some, just out it here,
 * but not forget about {@link ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator} package.
 */

public class Media {
    private String[] folderTree;
    private Menu[] menus;
    private World[] worlds;
    private Notification[] notifications;
    private Advertising[] advertise;

    public Menu[] getMenus() {
        return menus;
    }

    public World[] getWorlds() {
        return worlds;
    }

    public Notification[] getNotifications() {
        return notifications;
    }

    public Advertising[] getAdvertise() {
        return advertise;
    }

    public String[] getFolderTree() {
        return folderTree;
    }

    public void setFolderTree(String[] folderTree) { this.folderTree = folderTree; }

    public void setMenus(Menu[] menus) { this.menus = menus; }

    public void setWorlds(World[] worlds) { this.worlds = worlds; }

    public void setNotifications(Notification[] notifications) { this.notifications = notifications; }

    public void setAdvertise(Advertising[] advertise) { this.advertise = advertise; }

    public Media() {
    }
}