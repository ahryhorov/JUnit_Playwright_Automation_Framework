package pages;

import element.Element;
import utils.Assertions;

public class GoogleSearchPage {
    public Element searchField = new Element("//textarea[@id='APjFqb']");
    public Element searchResult = new Element("//ul/li[@data-view-type='1'][1]");
    public Element peopleAlsoAskLabel = new Element("//div[@id='search']//div[@jscontroller='Da4hkd']//span[contains(@class,'mgAbYb')]");

    public void performSearch(String searchQuery){
        searchField.fill(searchQuery);
        searchResult.assertIsDisplayed();
        Assertions.elementIsDisplayed(searchResult);
        searchField.pressKey("Enter");
        Assertions.elementIsDisplayed(peopleAlsoAskLabel);
    }
}
