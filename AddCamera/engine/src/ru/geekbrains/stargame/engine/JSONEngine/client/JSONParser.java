package ru.geekbrains.stargame.engine.JSONEngine.client;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

import ru.geekbrains.stargame.engine.JSONEngine.description.Client;

/**
 * Created by @author Shuttle on 3/7/18.
 *
 */

public class JSONParser {
    private ObjectMapper objectMapper = new ObjectMapper();

    public Client parseConfig(String config) throws IOException{
        return objectMapper.readValue(new File(config), Client.class);
    }
}
