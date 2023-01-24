#include <iostream>
#include <vector>

class Animal {

    public:

        std::string name; 
        int age;

        // class constructor 
        Animal(std::string x, int y) {

            name = x;
            age = y;

        }

        // A virtual function is a member function which is declared within a base class 
        // and is re-defined (overridden) by a derived class. When you refer to a derived class 
        // object using a pointer or a reference to the base class, you can call a virtual function 
        // for that object and execute the derived class’s version of the function. 
        virtual void eatFood(std::string worker_name) {

            std::cout << "Thanks for feeding me " << worker_name << " my name is " << name << ". And I am " << age << " years old." << "\n"; 

        }

        

};

class Cat: public Animal {

    public:

        // class constructor 
        Cat(std::string x, int y) : Animal(x,y) {

            name = x;
            age = y;

        }

        void eatFood(std::string worker_name) {

            std::cout << "Meow Thanks for feeding me " << worker_name << " my name is " << name << ". And I am " << age << " years old." << "\n"; 

        }


};

class Dog: public Animal {

    public:

        // class constructor 
        Dog(std::string x, int y) : Animal(x,y) {

            name = x;
            age = y;

        }

        void eatFood(std::string worker_name) {

            std::cout << "Woof Thanks for feeding me " << worker_name << " my name is " << name << ". And I am " << age << " years old." << "\n"; 

        }


};

class Worker {

    public:

        std::string name;

        // class constructor

        Worker(std::string x) {

            name = x;

        }

        void feedAnimal(Animal *animal) {

            animal -> eatFood(name);

        }

};

class Zoo {

    public:

        std::vector <Animal*> animalVector; // vector of pointers to animal objects
        std::vector <Worker> workerVector; // vector of worker objects

        void addWorker(std::string name) {

            Worker newWorker(name); // creating new worker, no need to allocate memory myself 
            workerVector.push_back(newWorker); //adds new worker to vector

        }

        void addAnimal(std::string name, int age) {

            // newAnimal is now a pointer to a new animal object 
            Animal *newAnimal = new Animal(name, age); // dynamically allocating memory myself as vector polymorphism
            animalVector.push_back(newAnimal); 

        }

        void addCat(std::string name, int age) {

            Cat *newCat = new Cat(name, age);
            animalVector.push_back(newCat);

        }

        void addDog(std::string name, int age) {

            Dog *newDog = new Dog(name, age);
            animalVector.push_back(newDog);

        }

        void feedingTime() {

            for (int i = 0; i < workerVector.size(); i++) {

                // loops for the amount of animals in the array
                for (int j = 0; j < animalVector.size(); j++) {
                    
                    // finds the current animal and worker in loop
                    Animal* thisAnimal = animalVector[j]; // points to animal object in vector - now polymorphism works? 
                    Worker thisWorker = workerVector[i]; 

                    // current worker will feed the current animal
                    thisWorker.feedAnimal(thisAnimal);

                }
            
        }


    }

};

int main() {

    Zoo myZoo; 
    myZoo.addCat("Rarity", 8);
    myZoo.addDog("Twinkie Star", 13);
    myZoo.addCat("Wasabi", 9);

    myZoo.addWorker("Amberlynn Reid");
    myZoo.addWorker("Becky");
    myZoo.addWorker("Wifey");

    myZoo.feedingTime();

    return 0; 

}