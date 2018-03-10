import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import ru.geekbrains.stargame.engine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.JSONEngine.description.Client;

/**
 * Created by sol on 3/11/18.
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
