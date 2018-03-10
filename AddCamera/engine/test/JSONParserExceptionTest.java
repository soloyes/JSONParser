import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import ru.geekbrains.stargame.engine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.JSONEngine.description.Client;

/**
 * Created by sol on 3/11/18.
 */

public class JSONParserExceptionTest {
    JSONParser jsonParser = new JSONParser();
    Client client;

    @Test(expected = IOException.class)
    public void test() throws IOException{
        client = jsonParser.parseConfig("config.json1");
    }
}
