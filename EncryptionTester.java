import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EncryptionTest {

    @Test
    void testSenLengthOneWord() {
        // The main method preprocesses the input string before calling SenLength
        String input = "Hello"; 
        int expected = 1;
        int actual = Encryption.SenLength(input);
        assertEquals(expected, actual, "Should return length of 1");
    }
}
