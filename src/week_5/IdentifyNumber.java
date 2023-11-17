package week_5;

public class IdentifyNumber {
    public static void main(String[] args) {
        int num=-10;
        boolean isPositive=num>0;
        boolean isNegative=num<0;
        boolean isZero=num==0;

        System.out.println(isNegative);
        System.out.println(isPositive);
        System.out.println(isZero);
        System.out.println("isPositive = " + isPositive);

        if(num>0) System.out.println("its positive");
        else if(num<0) System.out.println("ït s negative");
        else System.out.println("ït s zero");

    }


}
