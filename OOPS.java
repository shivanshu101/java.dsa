import java.util.*;

class Shapes {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }  
 }
 class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
 }
 
 public class OOPS{
    public static void main(String[] args){
        Triangle t = new Triangle();
        Circle  c = new Circle();

        t.area(5, 6);
        c.area(5);
        
    }
 }