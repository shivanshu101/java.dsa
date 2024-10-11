import java.util.*;

public class conditions{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int add = (a + b);
        System.out.println("sum = "+add);
        
        int sub = (a - b);
        System.out.println("difference = "+sub);
        
    
        
        float devide = (float) (a / b);
        System.out.println("Division = "+devide);
        
        int mul = (a * b);
        System.out.println( "Multiplication = "+mul);

    }    
    }