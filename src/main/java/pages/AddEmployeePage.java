package pages;

import org.openqa.selenium.By;

public class AddEmployeePage extends BasePage{

    private By firstNameInput = By.name("firstName");
    private By middleNameInput = By.name("middleName");
    private By lastNameInput = By.name("lastName");
    private By employeeIdInput = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");
    private By loginDetailsButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span");
    private By newUserLoginField = By.xpath("");
    private By newUserPasswordField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");
    private By newUserConfirmPwdField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");
    private By saveButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");


    public AddEmployeePage(){
        super(driver);
    }

    public void createNewEmployee(){
        type(firstNameInput,"Hugo");
        type(middleNameInput,"Andres");
        type(lastNameInput,"Agudelo");
        type(employeeIdInput,"1234567l");
        click(loginDetailsButton);
    }

    public void setNewUserPasswd(){
        type(newUserLoginField,"nuevoUsr");
        type(newUserPasswordField,"nuevoPwd");
        type(newUserConfirmPwdField,"nuevoPwd");
        click(saveButton);
    }
}
