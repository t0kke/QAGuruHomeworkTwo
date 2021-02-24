import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearchTest {

    @Test
    void searchSelenideWithGoogle() {
        // Открыть google
        open("https://www.google.com/");

        // Ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("#search").shouldHave(text("selenide.org"));
    }

    @Test
    void searchSelenideWithYandex() {
        open("https://yandex.ru/");
        $x("//input[@id='text']").setValue("Selenide").pressEnter();
        $("div #search-result").shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
