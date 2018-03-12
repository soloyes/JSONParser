package ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description;

/**
 * @author Shuttle on 3/7/18.
 */

public class Client {
    private Media media;

    public Media getMedia() {
        return media;
    }

    public Client(){}

    public Client(Media media) {
        this.media = media;
    }
}
