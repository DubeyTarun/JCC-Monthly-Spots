package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvitationStepDefs extends InvitationActions {
    WebDriver driver;

    @Given("^the user launches the web browser for Instagram$")
    public void launch_browser() throws InterruptedException {
        userLaunchesTheBrowser();
    }

    @Then("^the user logins to the instagram account$")
    public void theUserLoginsToTheInstagramAccount() throws InterruptedException {
        userLoginToInstaAccount();
    }

    @Then("^the user clicks on search button$")
    public void theUserClicksOnSearchButton() {
        clicksOnSearchButton();
    }

    @Then("^the user searches for the influencers$")
    public void theUserSearchesForTheInfluencers() throws InterruptedException {
        userSearchesTheInfluencers();
    }

    @Then("^the user closes the browser$")
    public void theUserClosesTheBrowser() {
        userClosesTheBrowser();
    }

    @Then("the user sends images to the influencers")
    public void theUserSendsImagesToTheInfluencers() {
        sendImagesToInfluencers();
    }
}
