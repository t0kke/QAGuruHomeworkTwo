import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideSearchTest {

    @Test
    void searchSelenideWithGoogle() {
        open("https://www.google.com/");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("#search").shouldHave(text("selenide.org"));
    }
    
    @Test
    void searchSelenideByYandex() {
        open("https://yandex.ru/");
        $("#text").val("Selenide").pressEnter();

        $("div #search-result").shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
