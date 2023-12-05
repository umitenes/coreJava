package week_7_Switch_Scanner;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pls insert a number");
        System.out.println(input.nextInt());
        int x=input.nextInt();
        System.out.println(x);
        System.out.println(input.nextByte());
        input.nextInt();
    }
}
