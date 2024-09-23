package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

 protected static WebDriver driver;


 public BasePage(WebDriver driver){
        BasePage.driver = driver;
 }

  static {
      System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
  }

  public static void setUrl(String url){
     driver.get(url);
  }

  public void close(){
     driver.quit();
  }

  public void click(By locator){
     driver.findElement(locator).click();
  }

  public void type(By locator, String text){
     driver.findElement(locator).sendKeys(text);
  }

  public String getTextFromElement(By locator){
     return driver.findElement(locator).getText();
 }

}
