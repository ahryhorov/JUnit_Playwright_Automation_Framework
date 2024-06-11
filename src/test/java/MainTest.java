import io.qameta.allure.Step;
import lib.GoogleLib;
import org.junit.Test;


public class MainTest extends BaseTest {

    //https://practice-automation.com/form-fields/
    @Test
    @Step("Input text to Google Search")
    public void googleSearchTest(){
        GoogleLib.performSearch("Automation Testing...");
    }
}
