package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvitationActions {

    String[] fakeId = {"missclassynova", "jaipurfoodcoaster", "jaipurfood", "sakshikothari16", "nonvegfoodie", "thequirkydrama", "i_archivj", "allthatsfancy",
            "food_o_graphy", "nayar_nehal", "sanjaysoinseo", "jaipurfoodpedia", "rajveerrabariofficial", "divyaarelwani", "lavina_tandon_"};

//    String[] fakeId = {"apekshaagarwal", "vidushiswaroop"};

    WebDriver driver;

    public void userLaunchesTheBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/accounts/login/");
        Thread.sleep(2000);
    }

    public void userLoginToInstaAccount() throws InterruptedException {
        driver.findElement(By.xpath("(//input)[1]")).sendKeys("jaipurcomedyclub");
        driver.findElement(By.xpath("(//input)[2]")).sendKeys("Comedy@1o1");
        driver.findElement(By.xpath("//button//div[contains(text(),'Log in')]")).click();
        Thread.sleep(10000);
    }

    public void clicksOnSearchButton() {
        driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Search']")).click();
    }

    public void userSearchesTheInfluencers() throws InterruptedException {

        for (int i = 0; i < fakeId.length; i++) {
            driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Search']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(fakeId[i]);
            Thread.sleep(5000);
            driver.findElement(By.xpath("(//div[text()='" + fakeId[i] + "'])[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button//div[contains(text(),'Message')]")).click();
            Thread.sleep(5000);
            if (i == 0) {
                driver.findElement(By.xpath("//button[contains(text(),'Not Now')]")).click();
            }

            driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys("Hi there!!, Hope you're doing well!");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[contains(text(),'Send')]")).click();
            driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys(
                    "Jaipur Comedy Club is all set to open. We've put everything in Jaipur's first ever comedy club " +
                            "and the opening night is going to be amazing. It'll be a night filled with laughter never experienced " +
                            "before. We promise you the best of comedians with their best of jokes to make this night a night to remember " +
                            "for all of you. You really cannot miss this one.");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[contains(text(),'Send')]")).click();
//            Thread.sleep(8000);
//            driver.findElement(By.xpath("(//input)[1]")).sendKeys("C:\\Users\\HP\\Downloads\\Invitation.png");
//        driver.findElement(By.xpath("(//input)[1]")).sendKeys("C:\\Users\\HP\\Downloads\\RePoster.png");

        }


    }

    public void sendImagesToInfluencers() {
        driver.findElement(By.xpath("(//input)[1]")).sendKeys("C:\\Users\\HP\\Downloads\\RePoster.png");
    }

    public void userClosesTheBrowser() {
        driver.close();
    }

}
