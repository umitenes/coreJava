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
/*
if(ch >= 48 && ch <= 57) {
            System.out.println("Digit");
        }else if( (ch >= 65 && ch <= 90)  || (ch >= 97 && ch <= 122)  ) {
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special character");
        }
 */