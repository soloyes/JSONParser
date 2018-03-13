import com.badlogic.gdx.Gdx;

import org.junit.Test;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.generator.Base;
import ru.geekbrains.stargame.engine.ConfigEngine.MediaEngine.MediaLoader;

/**
 * @author Shuttle on 3/12/18.
 */

public class MediaLoaderTest extends BaseTest{
    Client client = null;

    @Test
    public void test() throws Exception{
        client = new JSONParser().parseConfig("config.json");

        MediaLoader mediaLoader = new MediaLoader(client);
        Base[] advertisings = client.getMedia().getAdvertise();
        mediaLoader.load(advertisings);
        mediaLoader.getAssetManager().toString();
    }
}
