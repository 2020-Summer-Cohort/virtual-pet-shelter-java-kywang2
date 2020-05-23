package shelter;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class VirtualPetApp {

    static VirtualPetShelter petShelter = new VirtualPetShelter();
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        welcomeNote();
        petShelter.generatePets();
        petShelter.showPets();
        gameLoop();
    }

    public static void whatActivity() {
        System.out.println("What do you want to do?");
        System.out.println("1. Feed the Pets.");
        System.out.println("2. Give the Pets Water.");
        System.out.println("3. Play With a Pet.");
        System.out.println("4. Let Pets Sleep.");
        System.out.println("5. Adopt a Pet.");
        System.out.println("6. Admit a Pet.");
        int myResponse = input.nextInt();
        input.nextLine();
        if (myResponse == 1) {
            feedAnimals();
        } else if (myResponse == 2) {
            waterAnimals();
        } else if (myResponse == 3) {
            playWithAnimals();
        } else if (myResponse == 4) {
            letAnimalsSleep();
        } else if (myResponse == 5) {
            adoptAnimal();
        } else if (myResponse == 6) {
            admitAnimal();
        }
        petShelter.showPets();
        petShelter.tick();
    }

    public static void gameLoop() {
        petShelter.gamePlay();
    }

    public static void welcomeNote() {
        System.out.println("Hi, welcome to Kyle's adoption shelter.  We have an amazing variety of wonderful pets!  This is our list of pets today:");
    }

    public static void playWithAnimals() {
        System.out.println("You chose to play with the pets. Which pet would you like to play with?");
        petShelter.petNames();
        System.out.println("Enter the name of the pet or enter all to play with all pets: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            System.out.println("You chose to play with all the animals.");
            petShelter.playPet();
        } else {
            petShelter.playPet(myResponse);
        }
    }

    public static void feedAnimals() {
        System.out.println("You chose to feed the pets. Which pet would you like to feed?");
        petShelter.petNames();
        System.out.println("Enter the name of the pet or enter all to feed all pets: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            System.out.println("You chose to feed all the animals.");
            petShelter.feedPet();
        } else {
            petShelter.feedPet(myResponse);
        }
    }

    public static void waterAnimals() {
        System.out.println("You chose to give the pets water. Which pet would you like to give the water to?");
        petShelter.petNames();
        System.out.println("Enter the name of the pet or enter all to give all pets water: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            System.out.println("You chose to give all the animals water.");
            petShelter.waterPet();
        } else {
            petShelter.waterPet(myResponse);
        }
    }

    public static void letAnimalsSleep() {
        System.out.println("You chose to let the animals sleep");
        petShelter.letAnimalSleep();
    }

    public static void adoptAnimal() {
        System.out.println("You chose to adopt a pet. Which animal would you like to adopt?");
        petShelter.petNames();
        System.out.println("Enter the name of the pet or enter all to adopt all pets: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            petShelter.adoptPet();
        } else {
            System.out.println("You chose to adopt all the animals.");
            petShelter.adoptPet(myResponse);
        }
    }

    public static void admitAnimal() {
        System.out.println("You chose to admit a pet!");
        System.out.println("What is their name?");
        String admittedAnimalName = input.nextLine();
        System.out.println("How would you describe them (in 3 fun words)?");
        String admittedAnimalDescription = input.nextLine();
        int admittedAnimalHunger = rand.nextInt(10);
        int admittedAnimalThirst = rand.nextInt(10);
        int admittedAnimalPlay = rand.nextInt(10);
        int admittedAnimalSleep = rand.nextInt(10);
        VirtualPet animal = new VirtualPet(admittedAnimalHunger, admittedAnimalThirst, admittedAnimalPlay, admittedAnimalSleep, admittedAnimalName, admittedAnimalDescription);
        petShelter.intakePet(animal);
    }
}

