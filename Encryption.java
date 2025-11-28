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
        int senLength = senLength(sentence);
        if (pick == 1){
          System.out.println(sentence = moveWordsEnc(sentence, senLength));
        }
        //else if(pick == 2)
        //  run decryption
        //else
            //System.out.println(pick+" is not a valid choice");    
    }
    public static int add (int a, int b){
        return a+b;
    }
    public static int senLength (String sentence){
        sentence = sentence.replaceAll("\\s+", " ");
        int sentenceLengthBfr = sentence.length();
        sentence = sentence.replace(" ", "");
        int sentenceLengthAftr = sentence.length();
        int senLength = Math.abs(sentenceLengthAftr-sentenceLengthBfr);
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
}
