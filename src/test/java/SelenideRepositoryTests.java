import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideRepositoryTests {
    @Test
    void checkSampleCodeJUnit5OnPage() {
        open("https://github.com/selenide/selenide");
        $("span[data-content='Wiki']").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $("div[class='markdown-body']").shouldHave(text("Using JUnit5 extend test class"));
    }
}
