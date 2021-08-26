package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class LoginTest {
    public static void main(String[] args) throws IOException {

//        System.setProperty("webdriver.Chrome.driver", "F:\\Practise Intellij\\driver\\drivers\\ChromeDriver\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");

        boolean fbLogo = driver.findElement(By.xpath("//img[@class]")).isDisplayed();

        if(fbLogo){
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("F:/Practise Intellij/images/screenshot/verify.png"));
        }else{
            System.out.println("User not visit to Facebook page");
        }

        driver.quit();
    }
}
