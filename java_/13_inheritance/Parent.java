
public class Parent extends Grandparent {

    public Parent() {
        super();   
        // super is always there, we just explicitly wrote it here - always 1st statement

        System.out.println("parent constructor called");
    }

    public void parentMethod(){
        System.out.println("i am parent");
    }
}
