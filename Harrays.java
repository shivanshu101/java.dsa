
import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Harrays{
    public static void main(String[] args){
        // problem 1
      //  float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
      //  float sum = 0;
     //   for(float element:marks) {
      //      sum = sum + element;
      //  }System.out.println(sum);

      // problem 2
     // float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
     /// float num = 99.2f;
     //  boolean  isInArray = false;

    //  for(float element:marks) {
    //     if(num==element){
     //       isInArray = true;
     //       break;       
    //  }
   // }
  //  if(isInArray){
  //      System.out.println("this value is present");
 //   }  else{
   //     System.out.println("this value is not present");
  //  }

  // problem 3
    //  float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
    //    float sum = 0;
    //   for(float element:marks) {
    //       sum = sum + element;
     //   }System.out.println("the average value of marks is : "+ sum/marks.length);

   //   practice problem 4
  // int [][] mat1 = {{1,2,3},
                  //  {4,5,6}};
  //int [][] mat2  = {{2,6,13},
                  //  {3,7,1}}; 
  //int [][] result =  {{0,0,0},
                   // {0,0,0}};

   // for(int i=0; i<mat1.length; i++){ //row number of times 
    //  for(int j=0;j<mat1[i].length;j++){// column number of times
    //    System.out.format(" setting value for i=%d and j=%d\n", i,j);
    //    result[i][j] = mat1[i][j] + mat2[i][j];
   //   }
  //  }

    // printing the elements of a 2-D Arrays
     // for(int i=0; i<mat1.length; i++){  //row number of times
     //   for(int j=0;j<mat1[i].length;j++){  // column number of times
      //    System.out.print(result[i][j] + " ");
      //    result[i][j] = mat1[i][j] + mat2[i][j];
      //  }
      //  System.out.println(""); // print a new line
   // }

   //problem 5
  // int [] arr = {1, 2, 3, 4, 5, 6};
  // int l = arr.length;
  // int n =Math.floorDiv(l,2);
  // int temp;

  // for(int i=0; i<n; i++){
    //swap a[i] and a[l-1-i]
    // a  b  temp
//[4]  [3]  []
//temp = arr[i];
//arr[i] = arr[l-1-i];
//arr[l-1-i] = temp;

 // }
 // for(int element: arr){
 //   System.out.print(element+" ");
//  }

      // problem 6
 // int [] arr = {1, 21, 334, 455, 5, 6};
 // int max = 0;
     // for(int e: arr){
     //   if(e > max){
      //    max = e;
     //   }
    //  }
    //  System.out.println(" the maximun value in the arrays is : "+ max);
 
        // problem 7
           // System.out.println(Integer.MIN_VALUE); sabse chota element sabse bada element hai iska matlab
           // System.out.println(Integer.MAX_VALUE);
  //int [] arre = {1, 21, 334, 455, 5, 6};
  //int min = Integer.MAX_VALUE;                              
   //   for(int e: arre){
     //   if(e < min){
     //     min = e;
     //   }
     // }
     // System.out.println(" the minimum value in the arrays is : "+ min);
 
      // problem 8
       boolean isSorted = true;
       int [] arre = {1, 2, 3, 4, 5, 6};
        for(int i=0; i<arre.length-1; i++){
          if(arre[i] > arre[i+1]){
            isSorted = false;
            break;
          }
        }
        if(isSorted){
          System.out.println(" this arrey is sorted");
        }
        else{
          System.out.println(" this arrey is not sorted");
        }
    }
} 
  