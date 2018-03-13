package ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator;

/**
 * @author Shuttle on 3/7/18.
 *
 * Base class for other structures from {@link ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator} package.
 *
 * This class store base data, getters and setters which need to be operated by 'Jackson' library.
 *
 * To add something new - just extend from it, but not forget about changes in
 * {@link ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Media} class
 */

public abstract class Base {
    protected String name;
    protected String[] atlas;
    protected String[] texture;
    protected String[] font;
    protected String[] music;
    protected String[] sound;

    public Base() {

    }

    public String getName() {
        return name;
    }

    public String[] getAtlas() { return atlas; }

    public String[] getTexture() {
        return texture;
    }

    public String[] getFont() {
        return font;
    }

    public String[] getMusic() {
        return music;
    }

    public String[] getSound() {
        return sound;
    }

    public Base(String name, String[] atlas, String[] texture, String[] font, String[] music, String[] sound) {
        this.name = name;
        this.atlas = atlas;
        this.texture = texture;
        this.font = font;
        this.music = music;
        this.sound = sound;
    }
}
