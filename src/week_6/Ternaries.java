package week_6;

public class Ternaries {
    public static void main(String[] args) {
        boolean isEmployee=false;

       // if (isEmployee)                         // a>b
        //    System.out.println("You can get the credit");

        String result=(isEmployee) ? "you're eligible for the credit":"You are not eligible!";

        int result1= (5<=4) ? 10 : 0;
        System.out.println("result1 is : "+result1);

        int score=96;
        char letter='F';
        if(score>=0 && score<=100){
            letter= (score>=95)? 'A' : (score>=85) ? 'B': (score>=75) ? 'C':(score>=65) ? 'd': 'F';
            System.out.println(letter);
        }
        System.out.println("ït s invalid value");

    }
}
