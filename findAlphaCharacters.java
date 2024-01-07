package PrepareView;

public class findAlphaCharacters {

    public static void main(String[] args) {
        String str = "asdas123##";
        String newStr=str.replaceAll("[!-@]", "");

        System.out.println(newStr.length());


    }
}