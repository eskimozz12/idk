package tests.base.searchApartment;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import tests.base.BaseTest;

import static constants.Constant.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    public void checkIsRedirectToListing() {
        basePage.open(REALT_HOME_PAGE);

        realtHomePage
                .enterCountRooms()
                .clickToFind();

        realtListingPage.checkCountCards();
    }
}
