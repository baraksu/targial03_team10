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
        int result = Encryption.SenLength("what are you doing");
        assertEquals(4,result);
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
    }
    @Test
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
    @Test
    public void MoveLettersEnc1(){
        String result = Encryption.MoveLettersEnc("is",1);
        assertEquals("si",result);
    }
    @Test
    public void MoveLettersEnc2(){
        String result = Encryption.MoveLettersEnc("my",1);
        assertEquals("ym",result);
    }
    @Test
    public void MoveLettersEnc3(){
        String result = Encryption.MoveLettersEnc("hey everybody",2);
        assertEquals("dyhey everybo",result);
    }
    @Test
    public void MoveLettersEnc4(){
        String result = Encryption.MoveLettersEnc("very good",2);
        assertEquals("odvery go",result);
    }
    @Test
    public void MoveLettersEnc5(){
        String result = Encryption.MoveLettersEnc("my name is",3);
        assertEquals(" ismy name",result);
    }
    @Test
    public void MoveLettersDec1(){
        String result = Encryption.MoveLettersDec("why",1);
        assertEquals("hyw",result);
    }
    @Test
    public void MoveLettersDec2(){
        String result = Encryption.MoveLettersDec("are",1);
        assertEquals("rea",result);
    }
    @Test
    public void MoveLettersDec3(){
        String result = Encryption.MoveLettersDec("is my name",2);
        assertEquals(" my nameis",result);
    }
    @Test
    public void MoveLettersDec4(){
        String result = Encryption.MoveLettersDec("are you ready",3);
        assertEquals(" you readyare",result);
    }
    @Test
    public void MoveLettersDec5(){
        String result = Encryption.MoveLettersDec("what is this",3);
        assertEquals("t is thiswha",result);
    }
    @Test
    public void ReplaceEnc1(){
        String result = Encryption.ReplaceEnc("is");
        assertEquals("1s",result);
    }
    @Test
    public void ReplaceEnc2(){
        String result = Encryption.ReplaceEnc("are");
        assertEquals("@r#",result);
    }
    @Test
    public void ReplaceEnc3(){
        String result = Encryption.ReplaceEnc("why is");
        assertEquals("why 1s",result);
    }
    @Test
    public void ReplaceEnc4(){
        String result = Encryption.ReplaceEnc("am i ready");
        assertEquals("@m 1 r#@dy",result);
    }
    @Test
    public void ReplaceEnc5(){
        String result = Encryption.ReplaceEnc("chocolate");
        assertEquals("ch0c0l@t#",result);
    }
    @Test
    public void ReplaceDec1(){
        String result = Encryption.ReplaceDec("@r#");
        assertEquals("are",result);
    }
    @Test
    public void ReplaceDec2(){
        String result = Encryption.ReplaceDec("why");
        assertEquals("why",result);
    }
    @Test
    public void ReplaceDec3(){
        String result = Encryption.ReplaceDec("1 @m");
        assertEquals("i am",result);
    }
    @Test
    public void ReplaceDec4(){
        String result = Encryption.ReplaceDec("th# d#st1n@t10n");
        assertEquals("the destination",result);
    }
    @Test
    public void ReplaceDec5(){
        String result = Encryption.ReplaceDec("h#y");
        assertEquals("hey",result);
    }
}
