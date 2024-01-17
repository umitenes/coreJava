package week_10_StringContinue2;

import java.util.Scanner;

public class StringMethod4 {
    public static void main(String[] args) {
        String str1="Ichc";
        String str2="ichc";
        String str3=str1.repeat(5);
        System.out.println("str3 = " + str3);
        System.out.println(str2.repeat(10));
        boolean check=str1.equals(str2);
        System.out.println("check = " + check);
        String str5="Ichc";
        System.out.println(str1 == str5);

        String str7=new String("java");
        String str8="java";
        System.out.println(str7.equals(str8));
        System.out.println(str7 == str8);

        String username="umit";
        String password="Ichc@2024";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter user name:");
        String inputUserName=input.nextLine();
        input.nextLine();
        System.out.print("Enter password:");
        String inputPassword=input.nextLine();

        if (inputUserName.equalsIgnoreCase(username))
        {
            if (inputPassword.equals(password))
            {
                System.out.println("You're in");
            }
        }





    }
}
