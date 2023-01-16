import java.util.ArrayList;

public class Zoo {

    // creating two arraylist objects of animals and workers
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<Worker> workers = new ArrayList<>();

    // function to add a worker to the zoo, takes an argument of the name of the worker
    void addWorker(String name){

        // creates a new object of a new worker with their name
        Worker newWorker = new Worker(name);

        // adds the worker object to the array of workers
        workers.add(newWorker);

    }

    // function to add a dog to the zoo, takes an argument of the name and age of the dog
    void addDog(String name, int age){

        // creates a new object of a new dog with their name and age
        Dog newDog = new Dog(name, age);

        // adds the dog object to the array of animals
        animals.add(newDog);

    }

    // function to add a cat to the zoo, takes an argument of the name and age of the cat
    void addCat(String name, int age){

        // creates a new object of a new cat with their name and age
        Cat newCat = new Cat(name, age);

        // adds the cat object to the array of animals
        animals.add(newCat);

    }

    // function to begin feeding time - every single worker will feed every single animal once
    public void feedingTime(){

        // loops for amount of workers in the array
        for (int i = 0; i < workers.size(); i++) {

            // loops for the amount of animals in the array
            for (int j = 0; j < animals.size(); j++) {

                // finds the current animal and worker in loop
                Animal thisAnimal = animals.get(j);
                Worker thisWorker = workers.get(i);

                // current worker will feed the current animal!
                thisWorker.feedAnimal(thisAnimal);

            }

        }

    }

}
