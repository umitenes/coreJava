package week_9_String_Continue;
public class trimMethod {
    public static void main(String[] args) {

        String str="     welcome to ICHC    ";
        String strNew=str.trim();
        System.out.println("strNew = " + strNew);


        int indexOfE=strNew.indexOf("e ");
        System.out.println("indexOfE = " + indexOfE);

        int x=strNew.lastIndexOf("CH");
        System.out.println("x = " + x);

        String ichc="akdag.umit@ichc.ro";
        String newMail=ichc.substring(11,15);
        System.out.println("newMail = " + newMail);

        String email="akdag.umit@ichc.ro";
        int beginningIndex = email.indexOf("@") + 1 ;
        int endingIndex = email.lastIndexOf(".");
        String newMail1=email.substring(beginningIndex,endingIndex);
        System.out.println("newMail = " + newMail1);

        String item="12345#CA";
        int firstIndex=item.indexOf("#")+1;
        String itemLocation=item.substring(firstIndex);
        System.out.println("itemLocation = " + itemLocation);






    }
}
