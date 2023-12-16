package week_8_String;
public class StringMethods {
    public static void main(String[] args) {
        String word="ICHC";
        char thirdChar=word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        //char tentChar=word.charAt(10);
        //System.out.println("tentChar = " + tentChar); // out of range

        String schoolName="International School Of Constanta";
        int numberOfChars=schoolName.length();
        System.out.println("numberOfChars = " + numberOfChars);

        char lastChar=schoolName.charAt(schoolName.length()-1);
        System.out.println("lastChar = " + lastChar);

        String str="Wooden Spoon";
        str=str.toUpperCase();
        System.out.println("str = " + str);

        int  totalChars=str.replace(" ", "").length();
        System.out.println("totalChars = " + totalChars);
    }
}
