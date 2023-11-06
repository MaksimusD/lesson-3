package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindGithubTextTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600x900";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void FindGithubTextTest() {
        open("https://github.com");
        $("ul.d-lg-flex.list-style-none").$(Selectors.byText("Solutions")).hover();
        $("[href='/enterprise']").click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
    }
}
