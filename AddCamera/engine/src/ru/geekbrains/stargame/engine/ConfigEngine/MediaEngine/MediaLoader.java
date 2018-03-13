package ru.geekbrains.stargame.engine.ConfigEngine.MediaEngine;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Base;

/**
 * @author Shuttle on 3/12/18.
 */

public class MediaLoader {
    private AssetManager assetManager;

    public AssetManager getAssetManager() {
        return assetManager;
    }
    public MediaLoader(Client client) throws FileTreeIsNotFormed {
        new FolderTreeChecker(client);
        assetManager = new AssetManager();
    }

    public void load(Base[] bases) {
        for (int i = 0; i < bases.length; i++) {
            loadAtlases(bases[i].getAtlas());
            loadTextures(bases[i].getTexture());
            loadBitMapFonts(bases[i].getFont());
            loadMusic(bases[i].getMusic());
            loadSound(bases[i].getSound());
        }
    }

    private void loadAtlases(String[] atlases){
        for (int i = 0; i < atlases.length; i++) {
            assetManager.load(atlases[i], TextureAtlas.class);
        }
    }

    private void loadTextures(String[] textures) {
        for (int i = 0; i < textures.length; i++) {
            assetManager.load(textures[i], Texture.class);
        }
    }

    private void loadBitMapFonts(String[] fonts) {
        for (int i = 0; i < fonts.length; i++) {
            assetManager.load(fonts[i], BitmapFont.class);
        }
    }

    private void loadMusic(String[] music) {
        for (int i = 0; i < music.length; i++) {
            assetManager.load(music[i], Music.class);
        }
    }

    private void loadSound(String[] sounds) {
        for (int i = 0; i < sounds.length; i++) {
            assetManager.load(sounds[i], Sound.class);
        }
    }
}
