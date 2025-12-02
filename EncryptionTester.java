import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EncryptionTest {
    
    @Test
    public void testAdd(){
        int result = Encryption.SenLength("my");
        assertEquals(1,result); 
    }
    
}
