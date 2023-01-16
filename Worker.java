public class Worker {

    // blank undeclared string attribute
    public String name;

    // class constructor - special function that is used to initialize objects
    // it is called when an object is created
    Worker(String name) {

        // it sets the class's name to the name provided from the
        // constructor arguments so it can be used within the class
        this.name = name;

    }

    // function to feed an animal
    public void feedAnimal(Animal animal) {

        // calling the function to feed the animal will trigger the animal
        // to eat the food, takes argument of worker's name to thank them
        animal.eatFood(name);

    }

}
