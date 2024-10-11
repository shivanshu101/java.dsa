import java.util.*;

public class HStringB{
    public static void main(String[] args){
       // StringBuilder sb = new StringBuilder("tonystark");
        //System.out.println(sb);
     //   sb.setCharAt(2, 's');
    // sb.insert(2,'s');
   // sb.delete(2,3);
  // sb.append("stark");
     //   System.out.println(sb.length());
      
    //  for(int i=0; i<sb.length()/2; i++){
       // int front = i;
       // int back = sb.length() - 1 - i;

      //  char frontchar = sb.charAt(front);
      //  char backchar = sb.charAt(back);

       //  sb.setCharAt(front,backchar);
       // sb.setCharAt(back,frontchar);
   // }
   // System.out.println(sb);

   // codewithharry

   //problem 1
   StringBuilder sb = new StringBuilder("my tony   stark");
      // sb = sb.toLowerCase(); //find this meaning
    //  sb.setCharAt(2,'_');
     // sb.setCharAt(6,'_');
    //  sb.setCharAt(7,'_');
    //  sb.setCharAt(8,'_');
     // sb.setCharAt(9,'_');
     // System.out.println(sb);
       
    // problem 2
   //StringBuilder letter = new StringBuilder("Dear <|name|>, thanks a lot");
      //  letter = letter.replaceAt("<|name|>", "Harry");     " chick this shit"
       // System.out.println(sb);

       //problem 4
  //  String myString = "this string cantains   double or   triple spave";
   // System.out.println(myString.indexOf("  "));
  //  System.out.println(myString.indexOf("     "));

  //problem 5
  String myletter = "Dear Harry,\n\tThis Java Course is Nice.\n\tThanks!"; 
  System.out.println(myletter);
    }
}