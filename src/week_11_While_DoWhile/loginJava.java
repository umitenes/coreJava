package week_11_While_DoWhile;
import java.util.Scanner;
public class loginJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if( u.equals("Ichc")  && p.equals("Ichc123") ){ // if credentials are valid

            System.out.println("Logged in");

        }else{ // if credentials are not valid
            int attempts = 3; //3, 2, 1

            while( !(u.equals("Ichc")  && p.equals("Ichc123")) &&  attempts > 0 ){ // while the credentials are invalid, and user has attempts to reenter

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempts--;
            }
            if(u.equals("Ichc")  && p.equals("Ichc123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked.");
            }
        }
        scan.close();
    }
}
