package ru.geekbrains.stargame.engine.ConfigEngine.MediaEngine;

import com.badlogic.gdx.Gdx;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;

/**
 * @author Shuttle on 3/12/18.
 */

public class FolderTreeChecker {

    private String[] folderTree;

    public FolderTreeChecker(Client client) throws FileTreeIsNotFormed{
        boolean allExists = true;
        folderTree = client.getMedia().getFolderTree();
        for (int i = 0; i < folderTree.length; i++) {
            allExists &= Gdx.files.internal(folderTree[i]).exists();
        }

        if (!allExists) throw new FileTreeIsNotFormed("Local file tree is not formed");
    }
}
