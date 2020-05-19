package virtual_pet;

public class VirtualPet {

    int hunger;
    int thirst;
    int fatigue;
    int speed;
    int happiness;

    void receiveStatusUpdate() {
        System.out.println("\nThomas the Turtle");
        System.out.println("Thirst: " + thirst);
        System.out.println("Hunger: " + hunger);
        System.out.println("Fatigue: " + fatigue);
        System.out.println("Speed: " + speed);
        System.out.println("Happiness: " + happiness);
    }

    void eatFood() {
        hunger = 0;
        thirst ++;
    }

    void drinkWater() {
        thirst = 0;
        hunger ++;
    }

    // takeNap() will not effect the speed attribute.
    void takeNap() {
        hunger += 2;
        thirst += 2;
        fatigue = 0;
        happiness = 0;
    }

    void runSprints() {
        speed++;
        fatigue += 4;
        hunger += 2;
        thirst += 2;
    }

    void smile() {
        happiness += 3;
    }

}
