package ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.server;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Media;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Advertising;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Menu;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Notification;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.World;

/**
 * @author Shuttle on 3/7/18.
 *
 * Base class implementing {@link JSONCreatable} interface.
 *
 * Follow methods are invoking corresponding {@link Media} setters:
 *
 * {@link #setAdvertising(Media)}
 * {@link #setFolderTree(Media)}
 * {@link #setMenus(Media)}
 * {@link #setNotifications(Media)}
 * {@link #setWorlds(Media)}
 *
 * Added methods, returning arrays, for better operation on child classes:
 *
 * {@link World[] #setWorlds()}
 * {@link Notification[] #setNotifications()} ()}
 * {@link Menu[] #setMenus()}
 * {@link Advertising[] #setAdvertising()} )}
 * {@link String[] #setFolderTree()}
 *
 * HowTo use base class?
 * Extend this class, then override methods, returning arrays with needed data. Example:
 *
 *  @Override
 *      public Advertising[] setAdvertising() {
 *          Map<String, String> font = new HashMap<String, String>();
 *          font.put("fonts/font.fnt", "fonts/font.png");
 *          return new Advertising[]{
 *          new Advertising("Advertise1",
 *          new String[]{"atlases/mainAtlas.atlas"},
 *          new String[]{"textures/texture.png"},
 *          font,
 *          new String[]{"music/menu.ogg"},
 *          new String[]{"sounds/menu.ogg"})};
 *      }
 *
 *  Better way is check {@link ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.ServerDummy} as example.
 */

public abstract class JSONCreateBase implements JSONCreatable{

    @Override
    public void set(Media media) {
        setAdvertising(media);
        setFolderTree(media);
        setNotifications(media);
        setMenus(media);
        setWorlds(media);
    }

    @Override
    public void setAdvertising(Media media) {
        media.setAdvertise(setAdvertising());
    }

    protected abstract Advertising[] setAdvertising();

    @Override
    public void setFolderTree(Media media) {
        media.setFolderTree(setFolderTree());
    }

    protected abstract String[] setFolderTree();

    @Override
    public void setMenus(Media media) {
        media.setMenus(setMenus());
    }

    protected abstract Menu[] setMenus();

    @Override
    public void setWorlds(Media media) {
        media.setWorlds(setWorlds());
    }

    protected abstract World[] setWorlds();

    @Override
    public void setNotifications(Media media) {
        media.setNotifications(setNotifications());
    }

    protected abstract Notification[] setNotifications();
}