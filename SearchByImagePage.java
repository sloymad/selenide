import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchByImagePage {
    WebDriver driver;

    public SearchByImagePage(WebDriver driver) {
        this.driver = driver;
    }

    public By logoOfTheSelenide = By.xpath("(//IMG[@class='rg_ic rg_i'])[1]");
    public By allResultButton = By.xpath("//a[@class='q qs'][text()='All']");


    public SearchByImagePage searchSelenideLogo(){
        driver.findElement(logoOfTheSelenide).click();
        return new SearchByImagePage(driver);
        }

    public SearchResultPage backToResultList(){
        driver.findElement(allResultButton).click();
        return new SearchResultPage(driver);
    }



}
