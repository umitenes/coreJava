package week_8_String;
//import java.lang.String; implicitly done
public class StringIntro {
    public static void main(String[] args) {
        String name1="ICHC";
        String name2="ICHC";
        System.out.println(name2==name1); //true

        String str1=new String("ICHC");
        String str2=new String("ICHC");
        System.out.println(str2==str1); // false

        System.out.println(str1.equals(name1)); // true

        String s1="Java";
        String s2=new String("Java");
        System.out.println(s1.equals(s2)); // true

        String str="Java !";
        System.out.println("str = " + str.charAt(0));

    }
}
