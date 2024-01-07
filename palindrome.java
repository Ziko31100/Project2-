package PrepareView;

import java.util.Scanner;
import java.util.SortedMap;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("vvedite slovo");
       // String str="moma";
        String str=sc.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
            if(rev.equals(str)){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }

    }
}
