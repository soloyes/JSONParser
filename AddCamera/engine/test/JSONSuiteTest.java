import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by sol on 3/11/18.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JSONCreatorExceptionTest.class,
        JSONParserExceptionTest.class,
        JSONParserNULLTest.class,
        JSONParserTest.class
        }
)
public class JSONSuiteTest {
}
