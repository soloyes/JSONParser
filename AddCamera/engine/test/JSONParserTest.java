import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.client.JSONParser;
import ru.geekbrains.stargame.engine.ConfigEngine.JSONEngine.description.Client;

/**
 * @author Shuttle on 3/12/18.
 */


@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JSONParserTest {
    private static JSONParser jsonParser = new JSONParser();
    private static Client client;

    static {
        try {
            client = jsonParser.parseConfig("config.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String as;
    private String is;

    public JSONParserTest(String as, String is) {
        this.as = as;
        this.is = is;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> setParams(){
        Object[][] objects = new Object[][]{
                {client.getMedia().getAdvertise()[0].getAtlas()[0], "atlases/mainAtlas.atlas"},
                {client.getMedia().getAdvertise()[0].getTexture()[0], "textures/texture.png"},
                {client.getMedia().getAdvertise()[0].getFont()[0], "fonts/font.fnt"},
                {client.getMedia().getAdvertise()[0].getName(), "Advertise1"},
                {client.getMedia().getAdvertise()[0].getMusic()[0], "music/menu.ogg"},
                {client.getMedia().getAdvertise()[0].getSound()[0], "sounds/menu.ogg"}
        };
        return Arrays.asList(objects);
    }

    @Test
    public void test(){
        Assert.assertEquals(as, is);
    }

    @After
    public void delete(){

    }
}
