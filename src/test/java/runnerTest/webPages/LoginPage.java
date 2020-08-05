package runnerTest.webPages;

import org.openqa.selenium.By;

public class LoginPage extends ElementUtil{

    // Locators

    private By emailTextField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("u_0_b");
    private By errorMessage = By.xpath("//div[contains(text(), 'Log Into Facebook')]");

    // Actions

    public void enterEmail(String enterEmail){
        sendValue(emailTextField, enterEmail);
    }

    public void enterPassword(String enterPassword){
        sendValue(passwordField, enterPassword);
    }

    public void clickOnLogin(){
        clickOn(loginButton);
    }

    public String getTextElement(){
        return getTextFromElement(errorMessage);
    }
}
