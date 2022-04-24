package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EenaduLocators {
    private WebDriver _driver;
    private By name =By.xpath("//input[@id='Name']");
    private By email =By.xpath("//input[@id='emailid']");
    private By pwd = By.xpath("//input[@id='regpass']");
    private By conformpwd = By.xpath("//input[@id='txtconfrmPassword']");
    private By mobileno = By.xpath("//input[@id='txtMobileNo']");
    private By checkbox = By.xpath("//input[@id='chkTermsConditions']");
    private By reg = By.xpath("//button[@id='btnRegister']");


    public EenaduLocators(WebDriver driver){
        this._driver=driver;

    }
    public void name(String entername){
        _driver.findElement(this.name).sendKeys(entername);

    }
    public void email(String enteremail){
        _driver.findElement(this.email).sendKeys(enteremail);

    }
    public void password(String enterpwd){
        _driver.findElement(this.pwd).sendKeys(enterpwd);

    }
    public void enterconformpwd(String entconformpwd){
        _driver.findElement(this.conformpwd).sendKeys(entconformpwd);
    }
    public void mobilenoenter(String enterno){
        _driver.findElement(this.mobileno).sendKeys(enterno);

    }
    public void acceptterms(){
        _driver.findElement(this.checkbox).click();
    }
    public void registration(){
        _driver.findElement(this.reg).click();
    }



}
