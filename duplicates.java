package PrepareView;

import java.util.ArrayList;

/*
How can you remove all duplicates from ArrayList?

 */
public class duplicates {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("hello");
        str.add("mam");
        str.add("hello");
        str.add("ad");
        for (int i = 0; i < str.size(); i++) {
            int count=0;
            for (int j = i+1; j < str.size(); j++) {
                if (str.get(i).equalsIgnoreCase(str.get(j))) {
                    str.remove(j);
                    j--;


                }
            }

        }
        System.out.println(str);
    }
}