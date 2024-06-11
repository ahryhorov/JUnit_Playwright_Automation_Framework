package playwright;

import com.microsoft.playwright.*;

import java.awt.*;
import java.util.List;

public class PlaywrightFactory {
    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    public static void setupPlaywright() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(List.of("--start-maximized")));
        context = browser.newContext(new Browser.NewContextOptions()
                .setLocale("en-US").setViewportSize(null));
        page = context.newPage();
    }

    public static void tearDown() {
        page.close();
        context.close();
        browser.close();
        playwright.close();
    }

    public static void navigateTo(String url) {
        page.navigate(url);
    }
}
