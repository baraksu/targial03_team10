import java.util.*;
public class Encryption
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Program\nEnter 1 for Encrypt | 2 for Decrypt");
        int pick = input.nextInt();
        input.nextLine();
        System.out.println("Enter up to a 3 word sentence");
        String sentence = input.nextLine();
        sentence = sentence.replaceAll("\\s+", " ");
        sentence = sentence.trim();
        int senLength = senLength(sentence);
        if (pick == 1){
          sentence = moveWordsEnc(sentence, senLength);
          sentence = moveLettersEnc(sentence, senLength);
          sentence = replaceEnc(sentence);
          System.out.println("The encrypted sentence: " + sentence);
        }
        else if(pick == 2)
          sentence = moveWordsDec(sentence, senLength);
          // Move Vowels
          // Change Vowels
        else
            System.out.println(pick+" is not a valid choice");    
    }
    public static int add (int a, int b){
        return a+b;
    }
    public static int senLength (String sentence){       
        int sentenceLengthBfr = sentence.length();
        sentence = sentence.replace(" ", "");
        int sentenceLengthAftr = sentence.length();
        int senLength = sentenceLengthBfr-sentenceLengthAftr;
        return senLength+1;
    }
    public static String moveWordsEnc(String sentence, int senLength){
        if (senLength == 1)
            return sentence;
        else if (senLength == 2){
            String firstWord = sentence.substring(0, sentence.indexOf(" "));
            String lastWord = sentence.substring(sentence.indexOf(" ") + 1);
            return lastWord + " " + firstWord;
        }
        else{
            int indexOfLastSpace = sentence.lastIndexOf(" ");
            String thirdWord = sentence.substring(indexOfLastSpace + 1);
            String besideThirdWord = sentence.substring(0, indexOfLastSpace);
            return thirdWord + " " + besideThirdWord;
        }
    }
    public static String moveWordsDec(String sentence, int senLength){
        if (senLength == 1)
            return sentence;
        else if (senLength == 2){
            String firstWord = sentence.substring(0, sentence.indexOf(" "));
            String lastWord = sentence.substring(sentence.indexOf(" ") + 1);
            return lastWord + " " + firstWord;
        }
        else{    
        String firstWord = sentence.substring(0, sentence.indexOf(" ")); 
        String besideFirstWord = sentence.substring(sentence.indexOf(" ")+1);
        return besideFirstWord + " " + firstWord;
        }
    }
    public static String moveLettersEnc(String sentence, int senLength){
        if (senLength == 1){
            char lastChar = sentence.charAt(sentence.length() -1);
            String everythingButLastChar = sentence.substring(0, sentence.length() -1);
            return lastChar + everythingButLastChar;
        }
        else if (senLength == 2){
            String lastChars = sentence.substring(sentence.length() - 2);
            String everythingButLastChars = sentence.substring(0, sentence.length() -2);
            return lastChars + everythingButLastChars;
        }
        else{
            String lastChars = sentence.substring(sentence.length() -3);
            String everythingButLastChars = sentence.substring(0, sentence.length() -3);
            return lastChars + everythingButLastChars;
        }
    }
    public static String replaceEnc(String sentence){
        sentence = sentence.replace("a", "@");
        sentence = sentence.replace("e", "#");
        sentence = sentence.replace("i", "1");
        sentence = sentence.replace("o", "0");
        sentence = sentence.replace("u", "&");
        return sentence;
    }
}
