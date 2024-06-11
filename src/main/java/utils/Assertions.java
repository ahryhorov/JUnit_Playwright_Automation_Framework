package utils;

import com.microsoft.playwright.assertions.PlaywrightAssertions;
import element.Element;

public class Assertions {
    public static void elementIsDisplayed(Element element){
        PlaywrightAssertions.assertThat(element.elementLocator).isVisible();
    }
}
