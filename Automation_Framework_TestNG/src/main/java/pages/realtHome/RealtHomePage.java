package pages.realtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By apartBtn = By.xpath("//*[@id='main']/div[2]/nav/ul/li[1]/a");
    By countRooms = By.xpath("//form[@class='PropertyFilters_property-filters__content__body__M_5eD container-fluid container-xl']/div[1]/div[6]/div/label[1]");
    By findBtn = By.xpath("//div[@class='PropertyFilters_property-filters__content__body__buttons__l5nQ9']/button[1]");
    By option2Rooms = By.xpath("//label[2][@class='Checkbox_checkbox-label__j1CMy pro-checkbox-label Checkbox_checkbox-label--lg__wAz8g']/span");


    public RealtHomePage clickApartBtn() {

        waitElementsIsVisible(driver.findElement(apartBtn));
        driver.findElement(apartBtn).click();

        return this;
    }
    public  RealtHomePage clickToCountRoomsBtn(){

        waitElementsIsVisible(driver.findElement(countRooms));
        driver.findElement(countRooms).click();
        return this;
    }
    public RealtHomePage enterCountRooms() {

        waitElementsIsVisible(driver.findElement(option2Rooms));
        driver.findElement(option2Rooms).click();
        return this;
    }
    public RealtHomePage clickOutsideModalWindowCountRooms(){

        Dimension windowSize = driver.manage().window().getSize();

        int centerX = windowSize.getWidth() / 2;
        int centerY = windowSize.getHeight() / 2;

        Actions actions = new Actions(driver);
        actions.moveByOffset(centerX, centerY).click().build().perform();

        return this;
    }
    public RealtHomePage clickToFind(){

        waitElementsIsVisible(driver.findElement(findBtn));
        driver.findElement(findBtn).click();
        return this;
    }

}

