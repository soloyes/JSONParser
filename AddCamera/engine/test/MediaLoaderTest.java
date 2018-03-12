import org.junit.Test;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;
import ru.geekbrains.stargame.engine.ConfigEngine.MediaEngine.FolderTreeChecker;

/**
 * @author Shuttle on 3/12/18.
 */

public class MediaLoaderTest extends BaseTest{
    Client client = null;

    FolderTreeChecker checker;

    @Test
    public void test() throws Exception{
        client = new JSONParser().parseConfig("config.json");

        checker = new FolderTreeChecker(client);
    }
}
