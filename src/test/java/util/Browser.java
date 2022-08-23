package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void iniciarBrowser() {

        String url = "https://retrocards-front-gdt5chx99-micah-maclean.vercel.app/" ;

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,30);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.MICROSECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void finalizarBrowser() {
        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.MICROSECONDS);
        //driver.quit();
    }

}
