import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage{
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchField = By.xpath("//input[@id='lst-ib']");

    public GooglePage enterSearchName (String keyword){
        driver.findElement(searchField).sendKeys(keyword);
        return new GooglePage(driver);
    }

    public GooglePage startSearch (){
        driver.findElement(searchField).sendKeys(Keys.ENTER);
        return new GooglePage(driver);
    }




}

