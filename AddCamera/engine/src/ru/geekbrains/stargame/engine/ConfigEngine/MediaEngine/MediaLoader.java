package ru.geekbrains.stargame.engine.ConfigEngine.MediaEngine;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Media;

/**
 * @author Shuttle on 3/12/18.
 */

public class MediaLoader {
    MediaLoader(Client client) throws FileTreeIsNotFormed {
        new FolderTreeChecker(client);


    }

    private void mediaLoad(Media media){

    }

}
