import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;

/**
 * @author Shuttle on 3/12/18.
 */


public class JSONParserNULLTest {
    private JSONParser jsonParser = new JSONParser();
    private Client client;

    @Test
    public void test() throws IOException{
        client = jsonParser.parseConfig("config.json");
        Assert.assertNotNull(client);
    }
}
