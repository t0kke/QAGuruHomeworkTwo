import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositoryTests 
{
    @Test
    void checkSampleCodeJUnit5OnPage() {
        open("https://github.com/selenide/selenide");
        $("span[data-content='Wiki']").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $x("//a[text()='SoftAssertions']").click();
        $("div[class='markdown-body']").shouldHave(text("Using JUnit5 extend test class"));
    }
}
