import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;

//public class Recursion2{
    //public static void printRev(String str, int idx) {   
    //    if(idx == 0){     
    //     System.out.println(str.charAt(idx));
     //   return;    //  time complexicity = O(n) || n = length of string                      
     //  }
     //   System.out.print(str.charAt(idx));
     //   printRev(str, idx-1);
    //}
    //public static void main(String[] args){
    //  String str = "abcd";
     // printRev(str,str.length()-1);

    //}
    
//}

// Q find the 1st first and last occursion of an element

//public class Recursion2{
   // public static int first = -1;
   // public static int last = -1;
    
   // public static void findOccurance(String str, int idx, char element){
     //   if(idx == str.length()){
      //      System.out.println(first);
     //       System.out.println(last);
     //       return;
     //   }
      //  char currchar = str.charAt(idx);
      //  if(currchar == element) {
      //      if(first == -1){
      //          first = idx ;
      //      }else{
       //         last = idx;
       //     }
       // }
       // findOccurance(str, idx+1, element);
    //}
   // public static void main(String[] args){
    //  String str = "abaacdaefaah";
    // findOccurance(str, 0, 'a');

   // }
//}

// Q check the arr is sorted or strigthly increasing

//public class Recursion2{
  //  public static boolean isSorted(int arr[], int idx) { 
   //     if(idx == arr.length-1){
   //         return true;
   //     }  
  //  if(arr[idx] >= arr[idx+1]){
        // arry is sorted till nows
  //      return false;
 //   }
  //  return isSorted(arr,idx+1);
  //  }
  //  public static void main(String[] args){
  //     int arr[] = {1, 3, 5};  
  //    System.out.println(isSorted(arr, 0));

  //  }
//}

 // Q move all x to the end of a string {axbcxxd}
 
//public class Recursion2{
//public static void moveAllX(String str, int idx, int count, String newString){
//if(idx == str.length()){
//for(int i=0; i<count; i++){
 // newString += 'x';    // time complexcity = O(n)
//}
//System.out.println(newString);
//}
//  char currchar = str.charAt(idx);
//  if(currchar == 'x'){
//    count++;
//    moveAllX(str, idx+1, count, newString);
 // }else{
//   newString += currchar;  // newString = newString + currchar
//   moveAllX(str, idx+1, count, newString);
 // }
//}

 //   public static void main(String[] args){
 //    String str = "axbcxxd"  ;
 //    moveAllX(str, 0, 0, " ");

 //   }
//}

// Q remove all duplicate in a String

 // public class Recursion2{
 // public static boolean[] map = new boolean[26];

  //public static void removeDuplicate(String str, int idx, String newString){
//if(idx == str.length()) {
 // System.out.println(newString);
 // return;
//}

   // char currCurrect = str.charAt(idx);
   // if(map[currCurrect - 'a']){
   //   removeDuplicate(str, idx+1, newString);
   // }else{
    //  newString += currCurrect;
   //   map[currCurrect - 'a'] = true;
   //   removeDuplicate(str, idx+1, newString);
   // }
 // }

   // public static void main(String[] args){
    // String str = "abbccda"  ;
    // removeDuplicate(str, 0,""); 

   // }
// }

// Q print the subsequence of a string (abc)  IMPORTANT

 // public class Recursion2{
  // public static void subsequence(String str, int idx, String newString){
//if(idx == str.length()){
 // System.out.println(newString);
 // return;
//}
 //   char currchar = str.charAt(idx);  

    // to be

  //  subsequence(str, idx+1, newString+currchar);
    
    // or not to be
  //  subsequence(str, idx+1, newString);
  // }
  //  public static void main(String[] args){
   //  String str = "abc"  ;
   // subsequence(str, 0, "");

  //  }
// }

// Q print all unique sub sequence in a String "aaa" IMPORTANT

 // public class Recursion2{
 //public static void subsequence(String str, int idx, String newString, Hashset<String> set){
//if(idx == str.length()){
 // if(set.cantains(newString)){
 //   return;
 // }else{
 //   System.out.println(newString);
  //  set.add(newString);
//    return;
//  }
//}
 //   char currchar = str.charAt(idx);  

    // to be

   // subsequence(str, idx+1, newString+currchar);
    
    // or not to be
   // subsequence(str, idx+1, newString);
  // }
  //  public static void main(String[] args){
   //  String str = "aaa"  ;
   //  Hashset<String> set = new Hashset<>();
   // subsequence(str, 0,"", set);

   // }
// }

// Q print key pad combination 


  public class Recursion2{
    public static String[] keypad = {".", "abc", "def","ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
  
    public static void printcomb(String str, int idx, String combination) {
     if(idx == str.length()) {
      System.out.println(combination);
      return;
     }
      char currchar = str.charAt(idx);
      String mapping = keypad[currchar - '0'];

      for(int i=0; i<mapping.length(); i++){
        printcomb(str, idx+1, combination+mapping.charAt(i));
      }
    }
 
    public static void main(String[] args){
      String str = "23";
      printcomb(str, 0, "");

    }
 }