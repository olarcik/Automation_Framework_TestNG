package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;
import pages.realtHome.RealtHomePage;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='col']/article[@class='PropertyCard_property-card__mvexW']");

    public RealtListingPage checkCountCards(){
        waitElementsIsVisible(driver.findElement(card));

        int countCard = driver.findElements(card).size();
        System.out.println("Number of apartments cards is " + countCard);
        Assert.assertEquals(countCard,24);
        return this;
    }
}
