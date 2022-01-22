package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    protected SelenideElement
            createAccount = $(byXpath("//*[@id=\"myAccountDropdown\"]")),
            joinAccount = $(byText("Join")),
            email = $(By.id("Email")),
            firstName = $(By.id("FirstName")),
            lastName = $(By.id("LastName")),
            password = $(By.id("Password")),
            birthDay = $(By.id("BirthDay")).$(byAttribute("value", "24")),
            birthMonth = $(By.id("BirthMonth")).$(byAttribute("value", "11")),
            birthYear = $(By.id("BirthYear")).$(byAttribute("value", "1999")),
            emptybirthYear=$(By.id("BirthYear")).$(byAttribute("value", "0")),
            male = $(".tickbox-container", 0),
            checkBox = $(byText("Select All")),
            deletecheckBox = $(By.id("clear-all-checkbox-button")),
            checkMark1 = $(".checkmark"),
            modalButton = $(".modal-preference-button-open"),
            closeButton = $(".close-asos"),
            enabledButton = $(By.id("register")),
            disabledButton=$(By.id("register")),
            emailError=$(By.id("Email-error")),
            firstNameError=$(By.id("FirstName-error")),
            lastNameError=$(By.id("LastName-error")),
            passwordError=$(By.id("Password-error")),
            birthdayError=$(By.id("BirthYear-error"));

}