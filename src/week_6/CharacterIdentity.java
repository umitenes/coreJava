package week_6;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch='*';
        String res=(ch>='A' && ch<='Z')?"Alphabetic Character":
                   (ch>='a' && ch<='z')?"Alphabetic Character":
                           (ch>='0' && ch<='9')?"Digit Character":"special character";
        System.out.println(res);
    }
}