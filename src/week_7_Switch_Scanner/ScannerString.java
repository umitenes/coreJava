package week_7_Switch_Scanner;
import java.util.Scanner;
public class ScannerString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        System.out.println("name = " + name);

        byte num=scan.nextByte();
        System.out.println("num = " + num);

        scan.nextLine();

        String schoolName=scan.nextLine();
        System.out.println("schoolName = " + schoolName);


    }
}
