package L1Test;

public class TestOne {
    public static void main(String[] args) {

        System.out.println(reverseString("abc"));
    }
    public static String reverseString(String inputStr){
        char[] charArray = inputStr.toCharArray();
        StringBuilder resString = new StringBuilder();
        for(int i =charArray.length-1;i>=0;i--){
            resString.append(charArray[i]);
        }
        return resString.toString();
    }
}
