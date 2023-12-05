package week_8_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String firstName=scan.next();
        String lastName=scan.next();

        char f=firstName.charAt(0);
        char l=lastName.charAt(0);
        System.out.println("Initials : "+f+"."+l);

    }
}
