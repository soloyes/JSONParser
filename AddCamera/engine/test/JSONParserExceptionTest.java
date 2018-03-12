import org.junit.Test;

import java.io.IOException;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;

/**
 * @author Shuttle on 3/12/18.
 */


public class JSONParserExceptionTest {
    JSONParser jsonParser = new JSONParser();
    Client client;

    @Test(expected = IOException.class)
    public void test() throws IOException{
        client = jsonParser.parseConfig("config.json1");
    }
}
