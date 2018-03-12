package ru.geekbrains.stargame.engine.ConfigEngine.MediaEngine;

import java.io.IOException;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;

/**
 * @author Shuttle on 3/12/18.
 */

public class ClientDummy {
    private Client client = null;
    ClientDummy() throws IOException{
        JSONParser jsonParser = new JSONParser();
        client = jsonParser.parseConfig("config.json");
    }
}
