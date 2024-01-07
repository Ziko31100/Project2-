package PrepareView;

public class Vowels {
    /*   public static int countVowels(String str){
           int count=0;
           for(int i=0;i<str.length();i++){

           }

       }
*/
    public static void main(String[] args) {
        char ch = 'a';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
                System.out.println(ch+" vowels is present");
                break;
            default:
                System.out.println("no vowels");
        }


    }
}

/*
        String str = "documentation";


        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u')
            count++;

        }
        System.out.println("vowels"+count);

 */





