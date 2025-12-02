import static org.junit.Assert.*;
import org.junit.Test;

public class EncryptionTester
{
    @Test
    public void SenLength1(){
        
        int result = Encryption.SenLength("my");
        assertEquals(1,result);
        
    }
    @Test
    public void SenLength2(){
        int result = Encryption.SenLength("mya");
        assertEquals(1,result);
    }
    @Test
    public void SenLength3(){
        int result = Encryption.SenLength("my name");
        assertEquals(2,result);
    }
    @Test
    public void SenLength4(){
        int result = Encryption.SenLength("my name is");
        assertEquals(3,result);
    }
    @Test
    public void SenLength5(){
        int result = Encryption.SenLength("are you here");
        assertEquals(3,result);
    }
    
    @Test
    public void MoveWordsEnc1(){
        String result = Encryption.MoveWordsEnc("my",1);
        assertEquals("my",result);
    }
    @Test
    public void MoveWordsEnc2(){
        String result = Encryption.MoveWordsEnc("co",1);
        assertEquals("co",result);
    }
    @Test
    public void MoveWordsEnc3(){
        String result = Encryption.MoveWordsEnc("my name",2);
        assertEquals("name my",result);
    }@Test
    public void MoveWordsEnc4(){
        String result = Encryption.MoveWordsEnc("give your",2);
        assertEquals("your give",result);
    }
    @Test
    public void MoveWordsEnc5(){
        String result = Encryption.MoveWordsEnc("my name is",3);
        assertEquals("is my name",result);
    }
    @Test
    public void MoveWordsDec1(){
        String result = Encryption.MoveWordsDec("my",1);
        assertEquals("my",result);
    }
    @Test
    public void MoveWordsDec2(){
        String result = Encryption.MoveWordsDec("co",1);
        assertEquals("co",result);
    }
    @Test
    public void MoveWordsDec3(){
        String result = Encryption.MoveWordsDec("my name",2);
        assertEquals("name my",result);
    }
    @Test
    public void MoveWordsDec4(){
        String result = Encryption.MoveWordsDec("your give",2);
        assertEquals("give your",result);
    }
    @Test
    public void MoveWordsDec5(){
        String result = Encryption.MoveWordsDec("is my name",3);
        assertEquals("my name is",result);
    }
}
