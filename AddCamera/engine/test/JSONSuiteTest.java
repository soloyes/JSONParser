import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Shuttle on 3/12/18.
 */


@RunWith(Suite.class)
@Suite.SuiteClasses({
        JSONCreatorExceptionTest.class,
        JSONCreatorTest.class,
        JSONParserExceptionTest.class,
        JSONParserNULLTest.class,
        JSONParserTest.class
        }
)
public class JSONSuiteTest {
}
