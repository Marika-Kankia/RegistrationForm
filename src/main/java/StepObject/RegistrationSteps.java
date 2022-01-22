package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class RegistrationSteps extends RegistrationPage {
    @Step("Click for joining")
    public RegistrationSteps CreateAccount() {
        createAccount.click();
        return this;
    }

    @Step("Start registration")
    public RegistrationSteps join() {
        joinAccount.click();
        return this;
    }

    @Step("Fill email input,Value:{0}")
    public RegistrationSteps email(String Email) {
        email.setValue(Email);
        email.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Fill Firstname input,Value:{0}")
    public RegistrationSteps firstName(String FirstName) {
        firstName.setValue(FirstName);
        firstName.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Fill Lastname input,Value:{0}")
    public RegistrationSteps lastName(String LastName) {
        lastName.setValue(LastName);
        lastName.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Fill Password input,Value:{0}")
    public RegistrationSteps password(String Password) {
        password.setValue(Password);
        password.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Enter Birth Day")
    public RegistrationSteps birthDay() {
        birthDay.click();
        return this;
    }

    @Step("Enter Birth Month")
    public RegistrationSteps birthMonth() {
        birthMonth.click();
        return this;
    }

    @Step("Enter Birth Year")
    public RegistrationSteps birthYear() {
        birthYear.click();
        return this;
    }

    public RegistrationSteps EmptyBirthYear() {
        emptybirthYear.click();
        return this;
    }

    @Step("Select gender")
    public RegistrationSteps SelectGender() {
        male.click();
        return this;
    }

    @Step("Select all Chakebox at the same time")
    public RegistrationSteps SelectAllCheckBox() {
        checkBox.click();
        return this;
    }

    @Step("Delete all Chekbox")
    public RegistrationSteps DeleteCheckBox() {
        deletecheckBox.click();
        return this;
    }

    @Step("Select first option from the checkbox")
    public RegistrationSteps CheckMark1() {
        for(int i=0;i<=3;i++){
            checkMark1.click();
        }
        return this;
    }

    @Step("Click 'Tell me more about this' modal button")
    public RegistrationSteps ModalButton() {
        modalButton.click();
        return this;
    }

    @Step("Click close button")
    public RegistrationSteps CloseButton() {
        closeButton.click();
        return this;
    }

    @Step("Check if registration button is enabled")
    public RegistrationSteps EnabledButton() {
        enabledButton.is(Condition.enabled);
        return this;
    }

    @Step("Check if registration button is disabled")
    public RegistrationSteps DisabledButton() {
        disabledButton.is(Condition.disabled);
        return this;
    }

    @Step("Show 'Oops! You need to type your email here' error message")
    public RegistrationSteps EmailError() {
        Assert.assertTrue(emailError.is(Condition.visible));
        return this;
    }

    @Step("Show 'We need your first name – it’s nicer that way' error message")
    public RegistrationSteps FirstNameError() {
        Assert.assertTrue(firstNameError.is(Condition.visible));
        return this;
    }

    @Step("Show 'Last name, too, please!' error message")
    public RegistrationSteps LastNameError() {
        Assert.assertTrue(lastNameError.is(Condition.visible));
        return this;
    }

    @Step("Show 'Enter your full date of birth' error message")
    public RegistrationSteps BirthDayError() {
        Assert.assertFalse(birthdayError.is(Condition.visible));
        return this;
    }

    @Step("Show 'Hey, we need a password here' error message")
    public RegistrationSteps PasswordError() {
        passwordError.is(Condition.visible);
        return this;
    }

    @Step("Clear email input")
    public RegistrationSteps EmailSendKeys() {
        email.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return this;
    }

    @Step("Clear firstname input")
    public RegistrationSteps FirstnameSendKeys() {
        firstName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return this;
    }

    @Step("Clear lastname input")
    public RegistrationSteps LastNameSendkKeys() {
        lastName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return this;
    }

    @Step("Clear password input")
    public RegistrationSteps PasswordSendKeys() {
        password.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return this;
    }
}