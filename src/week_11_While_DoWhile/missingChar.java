package week_11_While_DoWhile;

import java.util.Scanner;

public class missingChar {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Give a string ");
        String str=input.nextLine();
        System.out.println(" index number ? ");
        int n=input.nextInt();

        for(int i=0; i<=str.length()-1; i++)
        {   if(i==n) continue;
            System.out.print(str.charAt(i));
        }
        

    }
}
