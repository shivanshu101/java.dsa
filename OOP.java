import javax.sql.rowset.spi.SyncResolver;

class pen {
    String color;
    String type; // bollpoint pen

    public void write(){
        System.out.println("write something");
    }
    public void printcolor(){
        System.out.println(this.color);
     }
    }
        class student{
            String name;
            int age;

            public void printInfo(String name){
                System.out.println(name);
            }
            public void printInfo(int age){
                System.out.println(age);
            }
            public void printInfo(String name, int age){
                System.out.println(name + " " + age);
        }
    }

    public class OOP{
     public  static void main(String[] args) {
     Student s1 =  new Student();
     s1.name = "Shivanshu";
     s1.age = 26;

     s1.printInfo(s1.name);



     }
    }
