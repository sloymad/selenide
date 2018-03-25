import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    public static void main (String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/distillery/Desktop/java/testselenium/Drivers/geckodriver 3");
        System.setProperty("webdriver.chrome.driver", "/Users/distillery/Desktop/java/testselenium/Drivers/chromedriver");


        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com/ncr");

        GooglePage googlePage = new GooglePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        SearchByImagePage searchByImagePage = new SearchByImagePage(driver);

        googlePage.enterSearchName("selenide");
        googlePage.startSearch();
        System.out.println(searchResultPage.getTopResult());
        searchResultPage.moveToImagesSearch();

        searchByImagePage.searchSelenideLogo();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        searchByImagePage.backToResultList();
        System.out.println(searchResultPage.getTopResult());



    }
}
