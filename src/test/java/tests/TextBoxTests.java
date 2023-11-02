package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600x900";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue("Maks");
        $("#lastName").setValue("Markov");
        $("#userEmail").setValue("maksim@testov.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("6663332233");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(1);
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--002").click();
        $("#subjectsInput").setValue("P").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("mufasa.jpg");
        $("#currentAddress").setValue("Pushkina Street");
        $("#state").click();
        $("#state").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#city").$(byText("Merrut")).click();
        $("#submit").click();

        $("tbody").shouldHave(text("Maks Markov"));
        $("tbody").shouldHave(text("maksim@testov.com"));
        $("tbody").shouldHave(text("Male"));
        $("tbody").shouldHave(text("6663332233"));
        $("tbody").shouldHave(text("02 February,2000"));
        $("tbody").shouldHave(text("Physics"));
        $("tbody").shouldHave(text("Sports"));
        $("tbody").shouldHave(text("mufasa.jpg"));
        $("tbody").shouldHave(text("Pushkina Street"));
        $("tbody").shouldHave(text("Uttar Pradesh Merrut"));
        $("#closeLargeModal").click();


    }
}