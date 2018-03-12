import org.junit.Test;

import java.io.IOException;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.ServerDummy;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.server.JSONCreator;

/**
 * @author Shuttle on 3/12/18.
 */

public class JSONCreatorTest {
    private JSONCreator jsonCreator = new JSONCreator();
    private ServerDummy dummy = new ServerDummy();

    @Test
    public void test(){
        try {
            jsonCreator.createConfig(dummy, "config.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
