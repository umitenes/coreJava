package week_11_While_DoWhile;
public class reverse {
    public static void main(String[] args) {
        String str="I love Java";   //CHCI     charAt(),   length()
                 // 0123
        String revStr="";

        for(int x=str.length()-1; x>=0; x-- )
            revStr= revStr + str.charAt(x);

            System.out.println(revStr);


    }
}
