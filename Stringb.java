import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;
public class Stringb{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("tony");
         System.out.println(sb);

      //  char at index 0
      //  System.out.println(sb.charAt(0));

        //set chae at index 0
       // sb.setCharAt(0,'p'); // changement
       // System.out.println(sb);

       //sb.insert(2,'n'); // To insert char at index
       //System.out.println(sb);

       // delete the extra n
      // sb.delete(2,4); //end index go only 3
      // System.out.println(sb);

      // StringBuilder sb = new StringBuilder("h");  //append add in last index
      // sb.append("e"); //star = star + "e";
      // sb.append("l"); //star = star + "l";
      // sb.append("l");
      // sb.append("o"); 
      // System.out.println(sb);
      // System.out.println(sb.length());

      for(int i=0; i<sb.length()/2; i++){
        int front = i;
        int back = sb.length() - 1 - i;

        char frontchar = sb.charAt(front); 
        char backchar = sb.charAt(back);

        sb.setCharAt(front,backchar);
        sb.setCharAt(back,frontchar);
      }
      System.out.println(sb);

    }
}