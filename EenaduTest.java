package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EenaduLocators;

public class EenaduTest {
    private WebDriver _driver;
    @BeforeMethod
    public void openbrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/java/dependcies/chromedriver.exe");
        _driver=new ChromeDriver();
        _driver.manage().window().maximize();
    }
    @Test
    public void registration(){
        _driver.get("https://epaper.eenadu.net/login/login");
        _driver.manage().window().maximize();
        EenaduLocators el = new EenaduLocators(_driver);
        el.name("suresh");
        el.email("sureshrocks66@gmail.com");
        el.password("122482566");
        el.enterconformpwd("122482566");
        el.mobilenoenter("9494519963");
        el.acceptterms();
        el.registration();
    }

}
