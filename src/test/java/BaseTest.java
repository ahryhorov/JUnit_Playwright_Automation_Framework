import org.junit.After;
import org.junit.Before;
import playwright.PlaywrightFactory;

public class BaseTest {
    @Before
    public void beforeEach() {
        PlaywrightFactory.setupPlaywright();
    }

    @After
    public void afterEach() {
        PlaywrightFactory.tearDown();
    }
}
