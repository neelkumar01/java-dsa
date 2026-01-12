
public class Child extends Parent {

    public Child() {
        System.out.println("child constructor called");
    }

    public void childMethod(){
        super.parentMethod();
        System.out.println("i am child");
    }

}
