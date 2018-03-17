import geb.spock.GebSpec

import pages.GooglePage
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@DisplayName("Search in Google")
@Severity(SeverityLevel.CRITICAL)

class GoogleSearchTest extends GebSpec
{
    def run()
    {
        when:

        def googlePage = browser.to GooglePage
        def googleSearchResults =  googlePage.makeSearchFor("test")

        then:
        googleSearchResults
    }
}