import org.junit.Test;

import java.io.IOException;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.ServerDummy;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.server.JSONCreator;

/**
 * @author Shuttle on 3/12/18.
 */


public class JSONCreatorExceptionTest {
    private JSONCreator jsonCreator = new JSONCreator();
    private ServerDummy dummy = new ServerDummy();

    @Test(expected = IOException.class)
    public void test() throws IOException{
        jsonCreator.createConfig(dummy, "blah-bla-h/config.json");
    }
}