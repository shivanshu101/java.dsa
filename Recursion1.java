 import java.util.*;
 
// public class Recursion1{

   // public static void printNumb(int n){
        // Q print the number from 5 to 1
        // Q print the number from 1 to 5   
      //  if(n == 0){
     //  if(n == 6){
         //   return;
      //  }
    //   System.out.println(n);    
     //   printNumb(n + 1);

   // }
   // public static void main(String[]args) {
   //     int n = 1;
    //    printNumb(n);
   // }
// }              



  // Q print sum of first n natural numbers
  
 //public class Recursion1{
    //public static void printNumb(int i, int n, int sum) {
    //   if(i == n){
      //  sum += i;
      //  System.out.println(sum);
     //   return;
     //  }
       
     //   sum += i;
     //   printNumb( i+1 , n, sum);
   // }
   
      
   // public static void main(String[]args) {
       
     //   printNumb(1, 5, 0);
   // }
// }              
 
  // Q print factorial of number n

   
// public class Recursion1{

   // public static int calcfactorial(int n){

     //  if(n == 1 || n == 0){
      //      return 1;
      //  }
        
       //  int fact_nm1 =  calcfactorial(n - 1);
       // int fact_n = n * fact_nm1;
       // return fact_n;
   // }
      
   // public static void main(String[]args) {
    //   int n = 5;
   //    int ans = calcfactorial(n);
   //   System.out.println(ans);
  //  }
// }              
  
 // Q print the fibonacci sequence till nth term    
   //  fibonacci series
    // a  b  c 
     //  c = a + b                                    
  
 //public class Recursion1{
  //public static void printFib(int a, int b, int n){
   // if(n == 0){
    //  return;
   // }
   // int c = a + b;
  //  System.out.println(c);
   // printFib(b, c, n-1);
  //} 
   
      
  //  public static void main(String[]args) {
   //   int a = 0 , b = 1;
   //   System.out.println(a);
   //   System.out.println(b);
   //   int n = 7;
   //   printFib(a, b, n-2);
 //}              
 //}

 // Q print x^n (Stack height = n)
 // given x | n;
 // " kaam " x^n = x(x^n-1) = x^n-1+1 = x^n;
 // Base case x^0 = 1 | X = 0;
  
  //  public class Recursion1{
  //public static int calcpower(int x , int n){
   // if(n == 0){  // base case 1
   //   return 1;
 //   }
 //   if(x == 0){  // base case 2
 //     return 0; 
 //   }
 // int xPowernm1 = calcpower(x , n - 1);   // kaaan 
//  int xPower = x * xPowernm1;
 // return xPower;
 // } 
   
 // public static void main(String[] args){
  //    int x = 2 , n = 5;
  //  int ans = calcpower(x, n);
  //  System.out.println(ans);
 // }
 
// }

  // Q print x^n (Stack height = logn)

     public class Recursion1{
 public static int calcpower(int x , int n){
    if(n == 0){  // base case 1
      return 1;
    }
    if(x == 0){  // base case 2
      return 0; 
    }
    // if n is even
  if(n % 2 == 0){ 
    return calcpower(x,n/2) * calcpower(x,n/2);
  }
  else{ // if n is odd
    return calcpower(x,n/2) * calcpower(x,n/2) * x;
  }
  } 
   
  public static void main(String[] args){
      int x = 2 , n = 5;
    int ans = calcpower(x, n);
    System.out.println(ans);
  }
}

