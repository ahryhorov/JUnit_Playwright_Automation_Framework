package lib;

import pages.GoogleSearchPage;
import playwright.PlaywrightFactory;


public class GoogleLib {
    public static GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    public static void performSearch(String searchQuery){
        navigateToGoogleHomePage();
        googleSearchPage.performSearch(searchQuery);
    }

    public static void navigateToGoogleHomePage(){
        PlaywrightFactory.navigateTo("https://www.google.com");
    }
}
