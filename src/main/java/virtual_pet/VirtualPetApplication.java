package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet thomasTurtle = new VirtualPet();
        System.out.println("\nHelp Thomas the Turtle get ready for his first race!");
        System.out.println("Thomas will be ready for his race when he reaches a speed rating of 5.");
        thomasTurtle.speed = 0;
        int userChoice;
        while (thomasTurtle.speed < 5) {
            thomasTurtle.receiveStatusUpdate();
            getInstructions();
            System.out.println("\nWhat would you like to do? Please type a number: ");
            userChoice = input.nextInt();
            if (userChoice == 1) {
                System.out.println("You gave water to Thomas.");
                thomasTurtle.drinkWater();
            } else if (userChoice == 2) {
                System.out.println("You gave food to Thomas.");
                thomasTurtle.eatFood();
            } else if (userChoice == 3) {
                System.out.println("You put Thomas to bed.");
                thomasTurtle.takeNap();
            } else if (userChoice == 4) {
                System.out.println("You had Thomas run sprints.");
                thomasTurtle.runSprints();
            } else if (userChoice == 5) {
                System.out.println("You left Thomas alone. He seems to be happy that you did.");
                thomasTurtle.smile();
            } else if (userChoice == 6) {
                System.out.println("You give up helping Thomas and leave him to fail.");
                break;
            }
        }
        /*
            Either of these conditional statements below will execute once the condition
            of the while loop above has been met (when speed is not < 5) OR the user
            exits the while loop by pressing "6".

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

    public static void getInstructions() {
        System.out.println("\nInstructions:");
        System.out.println("1. Give some water to Thomas");
        System.out.println("2. Give some food to Thomas");
        System.out.println("3. Have Thomas go to bed");
        System.out.println("4. Have Thomas run sprints");
        System.out.println("5. Leave Thomas alone, he'd be happier if you did");
        System.out.println("6. You no longer wish to help Thomas");
    }
}
