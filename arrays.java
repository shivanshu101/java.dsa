import java.util.*;

public class arrays{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int[] numbers = new int[size];

       //input
       for(int i=0; i<size; i++){
        numbers[i] = sc.nextInt();
       }

       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;

       //output
       for(int i=0; i<numbers.length; i++){
       if(numbers[i] < min){
        min = numbers[i];
       }
       if(numbers[i] > max){
        max = numbers[i];
       }
        } 
        System.out.println("larger number is : "+max);
        System.out.println("smaller number is : "+min);
       }
    }
