public class Animal {

    // blank undeclared string/int attributes
    public String name;
    public int age;


    // class constructor - special function that is used to initialize objects
    // it is called when an object is created
    Animal(String name, int age) {

        this.name = name;
        this.age = age;

    }

    // function to eat food, takes argument of worker's name to thank them
    public void eatFood(String name) {

        // thanks the worker whos been passed through the function, and uses this.name
        // for the animal to say its own name
        System.out.println("My name is " + this.name + ". Thank you for the food " + name + "!");

    }

}
