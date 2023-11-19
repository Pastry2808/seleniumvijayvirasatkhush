import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://vijaysvirasat.com/");
        String titleOfPage = driver.getTitle();
        System.out.println(titleOfPage);
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
    }
}
