import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {
    @Test
    void swapBlocks() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        //actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().perform();
        $$("#columns").shouldHave(exactTexts("B A"));
    }
}
