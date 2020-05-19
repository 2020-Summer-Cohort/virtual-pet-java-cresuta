package virtual_pet;

import java.util.Scanner;
/*
* Good first effort, I like where this is going, but can you fix up the issues I left in the comments and yet me know
* when it's done before this Friday morning?
 */
public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet thomasTurtle = new VirtualPet();
        System.out.println("\nHelp Thomas the Turtle get ready for his first race!");
        System.out.println("Thomas will be ready for his race when he reaches a speed rating of 5.");
        thomasTurtle.speed = 0;
        int userChoice;
        while (thomasTurtle.speed < 5) {
            thomasTurtle.tick();
            thomasTurtle.getInstructions();
            System.out.println("\nWhat would you like to do? Please type a number: ");
            userChoice = input.nextInt();
            if (userChoice == 1) {
                System.out.println("You gave water to Thomas.");
                thomasTurtle.getWater();
            } else if (userChoice == 2) {
                System.out.println("You gave food to Thomas.");
                thomasTurtle.getFood();
            } else if (userChoice == 3) {
                System.out.println("You put Thomas to bed.");
                thomasTurtle.getRest();
            } else if (userChoice == 4) {
                System.out.println("You had Thomas run sprints.");
                thomasTurtle.getSpeed();
            } else if (userChoice == 5) {
                System.out.println("You left Thomas alone. He looks to be happy.");
                thomasTurtle.getHappy();
            } else if (userChoice == 6) {
                System.out.println("You decided to no longer help Thomas.");
                break;
            }
        }
        /*
        * This block of code is unreachable, you may want to consider how to incorporate it or leave it out.
         */
        if (thomasTurtle.speed < 5) {
            System.out.println("\nTraining Thomas was too difficult.");
            System.out.println("Speed rating: " + thomasTurtle.speed);
            System.out.println("Thomas is not ready for his race!");
        } else {
            System.out.println("\nThomas has completed his training.");
            System.out.println("Speed rating: " + thomasTurtle.speed);
            System.out.println("Thomas is ready for his race!");
        }
    }
}
