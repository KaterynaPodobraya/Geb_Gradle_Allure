package pages
import geb.Page
import org.openqa.selenium.Keys


class GooglePage extends Page {
    static url = "https://www.google.com/"
    static at = { $(".gb_yg .gb_R:nth-of-type(1) .gb_P").text() == "Gmail" }

    static content = {
        googleInput {$("input#lst-ib")}
    }

    def makeSearchFor(String s) {
        googleInput << s
        Keys.ENTER
        browser.page(GoogleResultsPage.class)
    }
}