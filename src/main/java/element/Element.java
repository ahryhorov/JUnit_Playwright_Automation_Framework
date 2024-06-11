package element;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import playwright.PlaywrightFactory;

public class Element extends PlaywrightFactory {
    public Locator elementLocator;

    public Element(String locator){
        this.elementLocator = page.locator(locator);
    }

    public void fill(String text){
        elementLocator.fill(text);
    }

    public void pressKey(String keyName){
        elementLocator.press(keyName);
    }

    public void assertIsDisplayed(){
        PlaywrightAssertions.assertThat(elementLocator).isVisible();;
    }
}
