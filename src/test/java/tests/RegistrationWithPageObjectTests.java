package tests;

import pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class RegistrationWithPageObjectTests extends TestBase {


    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillformTest() {

        registrationPage.openPage()
                .removeBanner()
                .setFirstName("Maksim")
                .setLastName("Testov")
                .setUserEmail("makstestov@gmail.com")
                .setGender("Male")
                .setUserNumber("5554443322")
                .setDateOfBirth("25", "December", "1998")
                .setSubjectsInput("Arts")
                .setHobbies("Sports")
                .setHobbies("Reading")
                .setHobbies("Music")
                .setPicture()
                .setCurrentAddress("Discovery gardens.")
                .setState("Uttar Pradesh")
                .setCity("Merrut")
                .pressSubmit();

        registrationPage.checkResult("Student Name", "Maksim Testov")
                .checkResult("Student Email", "makstestov@gmail.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "5554443322")
                .checkResult("Date of Birth", "25 December,1998")
                .checkResult("Subjects", "Arts")
                .checkResult("Hobbies", "Sports, Reading, Music")
                .checkResult("Picture", "mufasa.jpg")
                .checkResult("Address", "Discovery gardens.")
                .checkResult("State and City", "Uttar Pradesh Merrut");
    }

    @Test
    void minimalData() {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName("Maksim")
                .setLastName("Testov")
                .setUserEmail("makstestov@gmail.com")
                .setGender("Male")
                .setUserNumber("5554443322")
                .pressSubmit();
        registrationPage.checkResult("Student Name", "Maksim Testov")
                .checkResult("Student Email", "makstestov@gmail.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "5554443322");

    }

    @Test
    void negativeTest() {
        registrationPage.openPage()
                .removeBanner()
                .pressSubmit()
                .checkNotCompleteForm();

    }


}
