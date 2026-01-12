public class Cat {

    String name;
    String breed;
    String color;

    // parametrized constructor

    public Cat(String name, String breed, String color) {

        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public Cat(String name) {           // constructor overloading

        this.name = name;
    }
}