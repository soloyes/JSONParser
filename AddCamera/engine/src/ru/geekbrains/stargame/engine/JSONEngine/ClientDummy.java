package ru.geekbrains.stargame.engine.JSONEngine;

import java.io.IOException;

import ru.geekbrains.stargame.engine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.JSONEngine.description.Client;

/**
 * Created by sol on 3/7/18.
 */

public class ClientDummy {
    public static void main(String[] args) throws IOException{
        JSONParser jsonParser = new JSONParser();
        Client client = jsonParser.parseConfig("config.json");
        System.out.println(client.getMedia().getAdvertise()[0].getAtlas()[0]);
    }
}
