import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage {

    WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public By firstTopResult = By.xpath("//*[@id='rso']//h3/a");
    public By imagesButton = By.xpath("//a[@class='q qs'][text()='Images']");



    public SearchByImagePage moveToImagesSearch(){
        driver.findElement(imagesButton).click();
        return new SearchByImagePage(driver);
    }

    public String getTopResult() {
        List<WebElement> findElements = driver.findElements(firstTopResult);
       String first_link = findElements.get(0).getAttribute("href");
        return first_link;

    }




}
