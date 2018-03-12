import org.junit.Test;

import java.io.IOException;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;
import ru.geekbrains.stargame.engine.ConfigEngine.MediaEngine.FileTreeIsNotFormed;
import ru.geekbrains.stargame.engine.ConfigEngine.MediaEngine.FolderTreeChecker;

/**
 * @author Shuttle on 3/12/18.
 */

public class MediaLoaderTestException extends BaseTest {
    Client client = null;

    FolderTreeChecker checker;

    @Test(expected = FileTreeIsNotFormed.class)
    public void test() throws FileTreeIsNotFormed, IOException{
        client = new JSONParser().parseConfig("config.json");
        client.getMedia().setFolderTree(new String[]{"bla-h"});
        checker = new FolderTreeChecker(client);
    }
}
