import org.example.Functions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        Assertions.assertEquals(Functions.getRandomNumber(), 14,"неверное число");
    }
}
