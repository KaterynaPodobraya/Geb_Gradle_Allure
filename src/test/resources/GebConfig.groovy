import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

atCheckWaiting = true

waiting
{
    timeout = 30
    retryInterval = 0.5
    includeCauseInMessage = true
    baseNavigatorWaiting = true
}

driver = {
    options = new ChromeOptions()
    options.addArguments("--start-fullscreen")
    new ChromeDriver(options) }

reportOnTestFailureOnly = true