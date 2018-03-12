package ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.server;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Media;

/**
 * @author Shuttle on 3/7/18.
 *
 * Interface that allows to create client config on server side.
 * Assume, that only base class may implement it.
 * Therefore, we must extends some base class in future.
 * Now, here we have only {@link JSONCreateBase).
 *
 * {@link #set(Media)} - method using for invoking all other methods, like:
 *
 * public void set(Media media) {
 *  setAdvertising(media);
 *  setFolderTree(media);
 *  setNotifications(media);
 *  setMenus(media);
 *  setWorlds(media);
 *  }
 *
 *  Below are methods invoking for calling corresponding setters from Media class:
 *
 * {@link #setAdvertising(Media)} - just call setAdvertising insight {@link Media}
 * {@link #setFolderTree(Media)} - just call setFolderTree insight {@link Media}
 * {@link #setMenus(Media)} - just call setMenus insight {@link Media}
 * {@link #setNotifications(Media)} - just call setNotifications insight {@link Media}
 * {@link #setWorlds(Media)} - just call setWorlds insight {@link Media}
 *
 * This is not Java8, so there is no default realization for methods.
 */

public interface JSONCreatable {
    void setAdvertising(Media media);

    void setFolderTree(Media media);

    void setMenus(Media media);

    void setWorlds(Media media);

    void setNotifications(Media media);

    void set(Media media);
}