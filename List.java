package PrepareView;

import java.util.ArrayList;
import java.util.Arrays;

/*
You have a list of strings and you want to keep only those that start with
        “A” and you want to return them in lower case".
*/
public class List {

      /*
        String str="hello how Are you, Are you know Alpha";

        String [] str1=str.split(" ");
      for(int i=0;i<str1.length;i++){
          if(str1[i].startsWith("A")){
              String val=str1[i].toLowerCase();
              System.out.println(val);
          }


      }
*/
      public static void main(String[] args) {
          ArrayList<String> str=new ArrayList<>();
          str.add("Hello");
          str.add("After");
          str.add("Appe");
          str.add("map");

for(int i=0;i<str.size();i++){

    if(str.get(i).startsWith("A")){
        System.out.println(str.get(i).toLowerCase());

     }

    }
}




}














