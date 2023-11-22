package week_6;

public class Calculator {
    public static void main(String[] args) {
        char op='-';
        int n1=200, n2=100;
        int res=(op=='+')?n1+n2:(op=='-')?n1-n2:(op=='*')?n1*n2:(op=='/')?n1/n2:0;
        System.out.println("result : "+res);
    }
}
