package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegistrationWithFakerTest extends TestBase {


    RegistrationPage registrationPage = new RegistrationPage();
    TestData data = new TestData();

    @Test
    void fillformTest() {


        registrationPage.openPage()
                .removeBanner()
                .setFirstName(data.firstName)
                .setLastName(data.lastName)
                .setUserEmail(data.userEmail)
                .setGender(data.gender)
                .setUserNumber(data.userNumber)
                .setDateOfBirth(data.day, data.month, data.year)
                .setSubjectsInput(data.subject)
                .setHobbies(data.hobbies)
                .setPicture()
                .setCurrentAddress(data.address)
                .setState(data.state)
                .setCity(data.city)
                .pressSubmit();

        registrationPage.checkResult("Student Name", data.firstName + " " + data.lastName)
                .checkResult("Student Email", data.userEmail)
                .checkResult("Gender", data.gender)
                .checkResult("Mobile", data.userNumber)
                .checkResult("Date of Birth", data.day + " " + data.month + "," + data.year)
                .checkResult("Subjects", data.subject)
                .checkResult("Hobbies", data.hobbies)
                .checkResult("Picture", "mufasa.jpg")
                .checkResult("Address", data.address)
                .checkResult("State and City", data.state + " " + data.city);
    }

    @Test
    void minimalData() {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName(data.firstName)
                .setLastName(data.lastName)
                .setUserEmail(data.userEmail)
                .setGender(data.gender)
                .setUserNumber(data.userNumber)
                .pressSubmit();
        registrationPage.checkResult("Student Name", data.firstName + " " + data.lastName)
                .checkResult("Student Email", data.userEmail)
                .checkResult("Gender", data.gender)
                .checkResult("Mobile", data.userNumber);

    }

}
