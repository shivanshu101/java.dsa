import java.util.*;

public class Strings{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
       //  String name =sc.nextLine();
       // System.out.println(" your name is : "+name);

      // concept 1

        //concatenation function adding of two String
        // String firstName = "tony";
        // String lastName = "stark";
        // String fullName = firstName + lastName;
        // System.out.println(firstName + "G" + lastName);
      
        // length concept 2

      // System.out.println(fullName.length());
      
      //charAt concept 3

      // for(int i=0; i<fullName.length(); i++){
      // System.out.println(fullName.charAt(i));
      // }
 
      // compare concept 4

     // String name1 = "tony";
     //  String name2 = "tony2";

      //1 s1 > s2 : +ve value
      //2 s1 == s2 : ==0
      //3 s1 < s2 : -ve value

     // if(name1.compareTo(name2) == 0) {
     // System.out.println(" strings are equal");
     //}else{
     //   System.out.println(" strings are not equal");
      //}

    //  if(name1 == name2) { //  if we take equal : but this case fails in many problems
    //    System.out.println(" strings are equal");
    //  }else{
    //    System.out.println(" strings are not equal");
    //  }
              // example of equal using in Strings
    //    if(new String("tony")  == new String("tony")){
    //      System.out.println(" Strings are equal");
    //    }else{
     //     System.out.println( "Strings are not equal");
    // }

      String sentence = "TonyStark";   // substring(beg index, end index):its small part of a big string
      String name = sentence.substring(4);
      System.out.println(name);
                                                              //bonas topic to learn parsing

        // Strings are immutable : means String can not modified
        // if we want to modified String we wat to create new String for modification.
    }
}
