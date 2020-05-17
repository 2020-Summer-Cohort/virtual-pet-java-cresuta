package virtual_pet;

public class VirtualPet {

    int hunger;
    int thirst;
    int fatigue;
    int speed;
    int happiness;

    void tick() {
        System.out.println("\nThomas the Turtle");
        System.out.println("Thirst: " + thirst);
        System.out.println("Hunger: " + hunger);
        System.out.println("Fatigue: " + fatigue);
        System.out.println("Speed: " + speed);
        System.out.println("Happiness: " + happiness);
    }

    void getInstructions(){
        System.out.println("\nInstructions:");
        System.out.println("1. Give some water to Thomas");
        System.out.println("2. Give some food to Thomas");
        System.out.println("3. Have Thomas go to bed");
        System.out.println("4. Have Thomas run sprints");
        System.out.println("5. Leave Thomas alone, he'd be happier if you did");
        System.out.println("6. You no longer wish to help Thomas");
    }

    void getFood() {
        hunger++;
    }

    void getWater() {
        thirst++;
    }

    // getRest() will reset all ratings, EXCEPT for speed
    void getRest() {
        hunger = 0;
        thirst = 0;
        fatigue = 0;
        happiness = 0;
    }

    void getSpeed() {
        speed++;
        fatigue += 2;
    }

    void getHappy() {
        happiness += 3;
    }

}
