package week_5;

public class MinNum {
    public static void main(String[] args) {
        int num1=100, num2=200;

        if(num1<num2)
            System.out.println(num1+" is minimum");
        else if (num2<num1)
            System.out.println(num2+" is minimum");
        else
            System.out.println(num1 + " "+ num2+" are equal");

    }
}
