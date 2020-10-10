import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import pageobjects.MyPersonalInformationPage;
import utils.WebDriverManagement;

public class UpdatePersonalInformation {

    @BeforeEach
    public void setUp() {
        WebDriverManagement.initializeWebDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverManagement.quitDriver();
    }

    @Test
    public void updatePersonalInformationTest() {

        LoginPage.loginWithValidUser();

        MyAccountPage.navigateToMyPersonalInformation();

        MyPersonalInformationPage.updateMyPersonalInformationData();

        MyPersonalInformationPage.validateUpdatedInformation();
    }
}
