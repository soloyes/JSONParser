package ru.geekbrains.stargame.engine.JSONEngine.server;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

import ru.geekbrains.stargame.engine.JSONEngine.description.Client;
import ru.geekbrains.stargame.engine.JSONEngine.description.Media;

/**
 * Created by @author Shuttle on 3/7/18.
 *
 * JSONCreator using Jackson library for JSON data quick creation based on Serialization mechanism and class
 * structures described in {@link ru.geekbrains.stargame.engine.JSONEngine.description} and
 * {@link ru.geekbrains.stargame.engine.JSONEngine.generator} packages.
 *
 * All we need - is create {@link JSONCreator} object, and invoke single method {@link #createConfig(JSONCreatable, String)}
 *
 * {@link JSONCreatable} creatable is object which extends {@link JSONCreateBase}
 * {@link String} config is the name of config file which will be created.
 *
 * 
 * For example check {@link ru.geekbrains.stargame.engine.JSONEngine.ClientDummy}
 */

public class JSONCreator {
    private ObjectMapper objectMapper = new ObjectMapper();

    public void createConfig(JSONCreatable creatable, String config) throws IOException{
        Media media = new Media();
        Client client = new Client(media);

        creatable.set(media);
        objectMapper.writeValue(new File(config), client);
    }
}