package tests.searchapartments;

import org.testng.annotations.Test;
import pages.base.BasePage;
import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {
    @Test
    public void checkIsRedirectToListing() {

       basePage.open("https://proimobil.md/");
       realtHomePage
               .clickApartBtn()
               .clickToCountRoomsBtn()
               .enterCountRooms()
               .clickOutsideModalWindowCountRooms()
               .clickToFind();
       realtListingPage
               .checkCountCards();
   }

}
