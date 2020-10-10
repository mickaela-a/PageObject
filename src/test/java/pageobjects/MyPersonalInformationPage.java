package pageobjects;

import utils.WebDriverManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.CommonConstants.INFORMATION_UPDATED_SUCCESFULLY;

public class MyPersonalInformationPage {

    public static void updateMyPersonalInformationData() {
        WebDriverManagement.sendKeysById("firstname", "Pedro");
        WebDriverManagement.sendKeysById("lastname", "Gonzalez");
        WebDriverManagement.sendKeysById("old_passwd", "Mickaela1");
        WebDriverManagement.sendKeysById("passwd", "Mickaela1");
        WebDriverManagement.sendKeysById("confirmation", "Mickaela1");
        WebDriverManagement.clickById("newsletter");
        WebDriverManagement.clickByCssSelector(".button-medium:nth-child(1) > span");
    }

    public static void validateUpdatedInformation() {
        assertEquals(INFORMATION_UPDATED_SUCCESFULLY, WebDriverManagement.getElementTextByCss(".alert"));
    }
}
