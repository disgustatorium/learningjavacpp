// extends keyword extends a class - inherits methods and attributes from parent class
// this is a subclass of animal and animal is the superclass (parent)
public class Cat extends Animal{

    // unique class constructor - constructors are not inherited by parent class
    // super will call superclass' attributes
    Cat(String name, int age) {

        super(name, age);

    }

    // same as animal eat food function but with "meow", overrides it if a dog is instantiated
    @Override
    public void eatFood(String name) {

        System.out.println("Meow! My name is " + this.name + ". Thank you for the food " + name + "!");

    }

}
