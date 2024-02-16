package week_13_Arrays;
import java.util.Arrays;
public class intro {
    public static void main(String[] args) {
        int number[]=new int[5];
        number[0]=10;
        number[1]=20;
        number[2]=30;

        System.out.println(Arrays.toString(number));
        System.out.println(number[4]);

        String day[]={"monday","tuesday","Wednesday","Thursday","Friday"};
        System.out.println(Arrays.toString(day));
        System.out.println(day[2]);
    }
}
