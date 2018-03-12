package ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.client;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;

/**
 * @author Shuttle on 3/7/18.
 *
 * JSONParser operates by 'Jackson' library for JSON data quick creation based on Serialization mechanism
 * and class structures described in {@link ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description} and
 * {@link ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator} packages.
 *
 * All we need is create {@link JSONParser} object, and invoke single method {@link #parseConfig(String)}
 *
 * {@link String} config is the name of config file which will be parsed.
 *
 * For example check {@link ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.ClientDummy}
 */

public class JSONParser {
    private ObjectMapper objectMapper = new ObjectMapper();

    public Client parseConfig(String config) throws IOException{
        return objectMapper.readValue(new File(config), Client.class);
    }
}
