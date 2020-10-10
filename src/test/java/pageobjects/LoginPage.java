package pageobjects;

import utils.WebDriverManagement;

public class LoginPage {

    public static void loginWithValidUser() {
        WebDriverManagement.navigateTo("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        WebDriverManagement.sendKeysById("email", "alarconmickaela@gmail.com");
        WebDriverManagement.sendKeysById("passwd", "Mickaela1");
        WebDriverManagement.clickByCssSelector("#SubmitLogin > span");
    }
}
