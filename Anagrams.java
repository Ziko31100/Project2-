package PrepareView;

import review7.Array;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
  /*
        String str="listen";

        String str1="silent";


           char [] array1=str.toCharArray();
           char [] array2=str1.toCharArray();

           if(array1.length != array2.length){

               System.out.println("is not anagram");
               System.exit(0);

           }

       Arrays.sort(array1);
       Arrays.sort(array2);

       for(int i=0;i<array1.length;i++){
           if(array1[i] !=array2[i]){
               System.out.println("is not anagram");
              System.exit(0);
           }

       }
        System.out.println("is Anagram");
*/

        String str1="someo";
        String str2="oemor";


        char [] c1=str1.toLowerCase().toCharArray();
        char [] c2=str2.toLowerCase().toCharArray();



        if(c1.length != c2.length){
            System.out.println("is not anagram");
            System.exit(0);
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

for(int i=0;i<c1.length;i++){
    if(c1[i] != c2[i]){
        System.out.println("is not anagram");
        System.exit(0);
    }

}
        System.out.println("is anagram");
        }

    }

