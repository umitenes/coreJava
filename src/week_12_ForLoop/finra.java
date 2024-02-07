package week_12_ForLoop;
public class finra {
    public static void main(String[] args) {

        for(int x=1;x<=100;x++){

            if(x%3==0){
                System.out.print("FIN ");
            } else if(x%5==0){
                System.out.print("RA ");
            } else if (x%15==0)
                System.out.print("FINRA ");
            else {
                System.out.print(x+" ");
            }
        }
    }
}
