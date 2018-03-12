package ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine;

import java.io.IOException;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;

/**
 * @author Shuttle on 3/7/18.
 */

public class ClientDummy {
    public static void main(String[] args) throws IOException{
        JSONParser jsonParser = new JSONParser();
        Client client = jsonParser.parseConfig("config.json");

        //How we can achieve exactly data from config:
        System.out.println(client.getMedia().getAdvertise()[0].getAtlas()[0]);
    }
}
