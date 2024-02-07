package week_12_ForLoop;

public class replace {
    public static void main(String[] args) {
        String str="xcodex";
        
       str= str.replaceFirst("x","a");

        System.out.println("str = " + str);
        
        str="xcodxex";
        
       String str1=str.replaceAll("x","I");
        System.out.println("str1 = " + str1);
        
    }
}
