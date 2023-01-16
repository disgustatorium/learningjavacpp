public class Main {

    public static void main(String[] args) {

        // creating new zoo object
        Zoo myZoo = new Zoo();

        // adding animals to the zoo!
        myZoo.addCat("Wasabi", 6);
        myZoo.addDog("Twinkie", 11);
        myZoo.addCat("Rarity", 5);

        // adding works to the zoo!
        myZoo.addWorker("Amberlynn Reid");
        myZoo.addWorker("Becky");
        myZoo.addWorker("Wifey");

        // call function for feeding time
        myZoo.feedingTime();

    }

}