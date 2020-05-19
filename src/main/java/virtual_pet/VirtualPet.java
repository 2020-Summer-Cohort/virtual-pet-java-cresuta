package virtual_pet;

public class VirtualPet {

    int hunger;
    int thirst;
    int fatigue;
    int speed;
    int happiness;
    /*
    * This isn't exactly what we were looking for in a tick method.  The tick method should adjust the fields after the
    * user takes an action.  Consider it an upkeep method that keeps the game interesting by making the user have to
    * address different needs after each action.  The method below would be better named 'receiveStatusUpdate()'.
     */
    void tick() {
        System.out.println("\nThomas the Turtle");
        System.out.println("Thirst: " + thirst);
        System.out.println("Hunger: " + hunger);
        System.out.println("Fatigue: " + fatigue);
        System.out.println("Speed: " + speed);
        System.out.println("Happiness: " + happiness);
    }

    /*
    * These instructions should be in the VirtualPetApplication class.
    * We want the VirtualPet class to be as reusable as possible, for instance if we used it in a web application we
    * wouldn't want the reliance to the console output.
     */
    void getInstructions(){
        System.out.println("\nInstructions:");
        System.out.println("1. Give some water to Thomas");
        System.out.println("2. Give some food to Thomas");
        System.out.println("3. Have Thomas go to bed");
        System.out.println("4. Have Thomas run sprints");
        System.out.println("5. Leave Thomas alone, he'd be happier if you did");
        System.out.println("6. You no longer wish to help Thomas");
    }
    /*
    * Rename these methods to something a little bit more clearer to their purpose.  Methods that start with the word
    * 'get' in Java refer to 'getter' methods by overwhelming popular convention.  A name for a method that effects the
    * 'hunger' field would be better named 'feed()'
     */
    void getFood() {
        hunger++;
    }

    void getWater() {
        thirst++;
    }


    /*
     * Consider renaming to takeNap()
     */
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
