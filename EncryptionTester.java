import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EncryptionTest {

    @Test
    void testSenLengthOneWord() {
        String input = "Hello"; 
        int expected = 1;
        int actual = Encryption.SenLength(input);
        assertEquals(expected, actual);
    }
}
