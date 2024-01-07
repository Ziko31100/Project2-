package PrepareView;
/*
Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.

 */
public class Count {
    public static void main(String[] args) {

   /*  Count a=new Count();
     a.str("Priver, andrei!@");
    }

    public  int str(String str){
        String []str1=str.split(" ");
        int str2=str1.length;
        System.out.println(str2);
        return str2;

    }
    */
String str="Hello, World!";
String []str1=str.split(" ");
int count=0;
if(str.length()!=0){
   count++;
}
for(int i=0;i<str.length();i++){
    if(str.charAt(i)==' '){
        count++;
    }

}
        System.out.println(count);

    }
}