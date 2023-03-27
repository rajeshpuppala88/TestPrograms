package L1Test;

import java.util.stream.IntStream;

public class PaindromeWithStreams {
    public static void main(String[] args) {
        paliCheckNormal();
        System.out.println("palindromeCheck2 +"+palindromeCheck2());
        System.out.println("palindromeCheck3 :"+palindromeCheck3());
    }
    public static void paliCheckNormal(){
        String input  = "xyx";
        int inputLength = input.length();
        StringBuilder result = new StringBuilder();
        for(int i=inputLength-1;i>=0;i--){
            result.append(input.charAt(i));
        }
        if(input.equals(result.toString())){
            System.out.println("palindromeCheck1 +"+"palindrome");
        }else{
            System.out.println("palindromeCheck1 +"+"not palindrome");
        }
    }

    public static boolean palindromeCheck2(){
        String input  = "xyxyx";
       for(int i=0;i<=input.length()/2;i++){
           if(input.charAt(i) != input.charAt(input.length()-1-i)){
               return false;
           }
       }
       return true;
    }

    public static boolean palindromeCheck3(){
        String input  = "xyxyxddd";
        return IntStream.range(0,input.length()/2).
                noneMatch(i -> input.charAt(i) != input.charAt(input.length()-1-i));
    }
}
