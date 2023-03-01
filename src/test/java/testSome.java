import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Какие-то тесты")
public class testSome {


    @DisplayName("Равенство")
    @Test
    void firstTest(){
        Assertions.assertEquals(5,5,"loose");
    }
}
