package ru.geekbrains.stargame.engine.JSONEngine.description;

import ru.geekbrains.stargame.engine.JSONEngine.generator.Advertising;
import ru.geekbrains.stargame.engine.JSONEngine.generator.Menu;
import ru.geekbrains.stargame.engine.JSONEngine.generator.Notification;
import ru.geekbrains.stargame.engine.JSONEngine.generator.World;

/**
 * Created by sol on 3/7/18.
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
}
