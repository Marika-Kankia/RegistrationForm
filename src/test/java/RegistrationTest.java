import Utils.ChromeRunner;
import StepObject.RegistrationSteps;
import com.sun.net.httpserver.Authenticator;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.RegistrationData.*;

@Listeners(Utils.TestLister.class)
public class RegistrationTest extends ChromeRunner {
    @Test(retryAnalyzer = Authenticator.Retry.class,priority = 0)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registration cases")
    public void case_1() {
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .CreateAccount()
                .join()
                .email(emailAddress)
                .firstName(firstName)
                .lastName(lastName)
                .password(password)
                .birthDay()
                .birthMonth()
                .birthYear()
                .SelectGender()
                .SelectAllCheckBox()
                .DeleteCheckBox()
                .CheckMark1()
                .ModalButton()
                .CloseButton()
                .EnabledButton();


    }

    @Test(retryAnalyzer = Authenticator.Retry.class,priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registration cases")
    public void case2(){
        RegistrationSteps steps=new RegistrationSteps();
        steps
//          .CreateAccount()
//          .join()
                .EmailSendKeys()
                .FirstnameSendKeys()
                .LastNameSendkKeys()
                .PasswordSendKeys()
                .email("marikakankia")
                .firstName("marika")
                .EmailError()
                .EmailSendKeys()
                .email("marikakankia72")
                .EmailError()
                .EmailSendKeys()
                .email("marikakankia72@")
                .EmailError()
                .email("marikakankia72@gmail.com")
                .FirstnameSendKeys()
                .FirstNameError()
                .lastName("kankia")
                .LastNameSendkKeys()
                .password("marik")
                .LastNameError()
                .DisabledButton()
                .birthDay()
                .PasswordError()
                .birthMonth()
                .EmptyBirthYear()
                .BirthDayError();


    }
}

