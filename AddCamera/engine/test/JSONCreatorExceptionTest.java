import org.junit.Test;

import java.io.IOException;

import ru.geekbrains.stargame.engine.JSONEngine.ServerDummy;
import ru.geekbrains.stargame.engine.JSONEngine.server.JSONCreator;

/**
 * Created by sol on 3/11/18.
 */

public class JSONCreatorExceptionTest {
    private JSONCreator jsonCreator = new JSONCreator();
    private ServerDummy dummy = new ServerDummy();

    @Test(expected = IOException.class)
    public void test() throws IOException{
        jsonCreator.createConfig(dummy, "blah-bla-h/config.json");
    }
}