package pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage{

    private By pimOption = By.linkText("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPimModule");
    private By addButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");

    public DashboardPage() {
        super(driver);
    }


    public void clickPimOption(){
        click(pimOption);
    }

    public void clickAddButton() {
        click(addButton);
    }


}
