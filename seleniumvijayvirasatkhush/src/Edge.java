import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://vijaysvirasat.com/");
        String titleOfPage = driver.getTitle();
        System.out.println(titleOfPage);
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
    }
}
