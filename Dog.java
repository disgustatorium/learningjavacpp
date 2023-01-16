// extends keyword extends a class - inherits methods and attributes from parent class
// this is a subclass of animal and animal is the superclass (parent)
public class Dog extends Animal {

    // unique class constructor - constructors are not inherited by parent class
    // super will call superclass' attributes
    Dog(String name, int age) {

        super(name, age);

    }

    // same as animal eat food function but with "woof", overrides it if a dog is instantiated
    @Override
    public void eatFood(String name) {

        System.out.println("Woof! My name is " + this.name + ". Thank you for the food " + name + "!");

    }
}
