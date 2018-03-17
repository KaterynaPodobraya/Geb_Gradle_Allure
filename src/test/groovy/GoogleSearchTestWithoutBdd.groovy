import geb.spock.GebSpec
import io.qameta.allure.Severity
import io.qameta.allure.SeverityLevel
import io.qameta.allure.Story
import io.qameta.allure.junit4.DisplayName
import io.qameta.allure.Feature

import pages.GooglePage

@DisplayName("Search in Google")
@Severity(SeverityLevel.CRITICAL)
@Feature("Search Inline Pattern")
@Story("User can make search")

class GoogleSearchTestWithoutBdd extends GebSpec
{
    def Test()
    {
        def googlePage = browser.to GooglePage
        def googleSearchResults = googlePage.makeSearchFor("test")

        browser.at googleSearchResults
        assert googleSearchResults.logo.isDisplayed()
    }
}