import java.util.*;

public class conditions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int button = sc.nextInt();
        
      //  if(button == 1){
          //  System.out.println("hello");
    //    } else if (button == 2) {
       //     System.out.println("namaste");
        //} else if (button == 3) {
          //  System.out.println("bonjoi");
       // } else {
         //   System.out.println("invalid number");
        //}
        
        switch (button) {
            case 1 : System.out.println("hello");
                break;
            case 2 : System.out.println("namaste");
                break;
            case 3 :System.out.println("bonjoi");
                break;
            default:
                System.out.println("invalid number");
                
        }
    }
}