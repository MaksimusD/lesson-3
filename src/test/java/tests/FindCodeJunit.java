package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class FindCodeJunit {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600x900";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void FindCodeJunitTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").$("ul").$$("li")
                .shouldHave(itemWithText("Soft assertions"));
        open("https://github.com/selenide/selenide/wiki/SoftAssertions");
        $("#user-content-3-using-junit5-extend-test-class").sibling(0)
                .shouldHave(exactText("@ExtendWith({SoftAssertsExtension.class})\n" +
                        "class Tests {\n" +
                        "  @Test\n" +
                        "  void test() {\n" +
                        "    Configuration.assertionMode = SOFT;\n" +
                        "    open(\"page.html\");\n" +
                        "\n" +
                        "    $(\"#first\").should(visible).click();\n" +
                        "    $(\"#second\").should(visible).click();\n" +
                        "  }\n" +
                        "}"));
    }
}
