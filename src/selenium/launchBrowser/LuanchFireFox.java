package selenium.launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LuanchFireFox {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/deeptha.naik/Downloads/geckodriver2");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.nnnow.com");
        driver.close();
    }


}
