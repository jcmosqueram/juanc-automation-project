package pages;


import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private By userField = By.name("username");
    private By userePasswordField = By.name("password");
    private By loginButton = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");


    public HomePage() {
        super(driver);
    }

    public void loadWebPage() {
        setUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void loginUser() {
        type(userField,"Admin");
        type(userePasswordField,"admin123");
        click(loginButton);
    }

}
