
public class Main {

    /*
    Access modifiers - keyword that decide visiblity of class, methods and other members
    */

   public static void main(String[] args) {
       
       Student boy = new Student();

       boy.age = 12;
       boy.name = "ram";

       Toy.start();

       School.getInstance();
   }
}