package shelter;

import java.util.ArrayList;
import java.util.Random;

public class VirtualPetShelter {

    static Random rand = new Random();
    public static ArrayList<VirtualPet> petArrayList = new ArrayList<VirtualPet>();

    public static void generatePets() {
        VirtualPet pet1 = new VirtualPet(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                rand.nextInt(10), "Larry the Lizard", "Sweet, Slippery, Smooth");
        VirtualPet pet2 = new VirtualPet(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                rand.nextInt(10), "Harry the Hamster", "Fluffy, Furry, Flamboyant");
        VirtualPet pet3 = new VirtualPet(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                rand.nextInt(10), "Kenny the Chameleon", "Cool, Calm, Camouflaged");
        VirtualPet pet4 = new VirtualPet(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                rand.nextInt(10), "Peter the Parrot", "Talkative, Territorial, Tame");
        petArrayList.add(pet1);
        petArrayList.add(pet2);
        petArrayList.add(pet3);
        petArrayList.add(pet4);
    }

    public static void showPets() {
        for (int i = 0; i < petArrayList.size(); i++) {
            System.out.println("We have: " + petArrayList.get(i).getName());
            System.out.println("Their description is: " + petArrayList.get(i).getNameDescription());
            System.out.println("Their hunger level is: " + petArrayList.get(i).getHunger());
            System.out.println("Their thirst level is: " + petArrayList.get(i).getThirst());
            System.out.println("Their play level is: " + petArrayList.get(i).getPlay());
            System.out.println("Their sleep level is: " + petArrayList.get(i).getSleep());
        }
    }

    public static void petNames() {
        for (int i = 0; i < petArrayList.size(); i++) {
            System.out.println("We have: " + petArrayList.get(i).getName());
        }
    }

    public static void gamePlay() {
        while (true) {
            for (int i = 0; i < petArrayList.size(); i++) {
                if ((petArrayList.get(i).getHunger() > 0 && petArrayList.get(i).getHunger() < 15) &&
                        (petArrayList.get(i).getThirst() > 0 && petArrayList.get(i).getThirst() < 15) &&
                        (petArrayList.get(i).getPlay() > 0 && petArrayList.get(i).getPlay() < 15) &&
                        (petArrayList.get(i).getSleep() > 0 && petArrayList.get(i).getSleep() < 15)) {
                    VirtualPetApp.whatActivity();
                }
            } gameOver();
        }
    }

    public static void gameOver() {
        for (int i = 0; i < petArrayList.size(); i++) {
            if (petArrayList.get(i).getHunger() >= 15) {
                System.out.println(petArrayList.get(i).getName() + " is too hungry and ran away.  You lose. Game Over!");
                System.exit(0);
            } else if (petArrayList.get(i).getThirst() >= 15) {
                System.out.println(petArrayList.get(i).getName() + " is too thirsty and ran away.  You lose. Game Over!");
                System.exit(0);
            } else if (petArrayList.get(i).getPlay() >= 15) {
                System.out.println(petArrayList.get(i).getName() + " is too bored and ran away.  You lose.  Game Over!");
                System.exit(0);
            } else if (petArrayList.get(i).getSleep() >= 15) {
                System.out.println(petArrayList.get(i).getName() + " is too tired and ran away.  You lose.  Game Over!");
                System.exit(0);
            }
        }
    }


    public static void adoptPet(String name) {
        for (int i = 0; i < petArrayList.size(); i++) {
            if (petArrayList.get(i).getName().equals(name)) {
                System.out.println("You chose to adopt: " + petArrayList.get(i).getName());
                System.out.println("Their description is: " + petArrayList.get(i).getNameDescription());
                petArrayList.remove(i);
            }
        }
    }

    public static void adoptPet() {
        for (int i = 0; i < petArrayList.size(); i++) {
            petArrayList.remove(i);
        }
    }

    public static void intakePet(VirtualPet pet) {
        petArrayList.add(pet);
    }

    public static void feedPet(String name) {
        for (int i = 0; i < petArrayList.size(); i++) {
            if (petArrayList.get(i).getName().equals(name)) {
                System.out.println("You chose to feed: " + petArrayList.get(i).getName());
                System.out.println("Their description is: " + petArrayList.get(i).getNameDescription());
                petArrayList.get(i).feed();
            }
        }
    }

    public static void feedPet() {
        for (int i = 0; i < petArrayList.size(); i++) {
            petArrayList.get(i).feed();
        }
    }

    public static void waterPet(String name) {
        for (int i = 0; i < petArrayList.size(); i++) {
            if (petArrayList.get(i).getName().equals(name)) {
                System.out.println("You chose to give water to: " + petArrayList.get(i).getName());
                System.out.println("Their description is: " + petArrayList.get(i).getNameDescription());
                petArrayList.get(i).water();
            }
        }
    }

    public static void waterPet() {
        for (int i = 0; i < petArrayList.size(); i++) {
            petArrayList.get(i).water();
        }
    }

    public static void playPet(String name) {
        for (int i = 0; i < petArrayList.size(); i++) {
            if (petArrayList.get(i).getName().equals(name)) {
                System.out.println("You chose to play with: " + petArrayList.get(i).getName());
                System.out.println("Their description is: " + petArrayList.get(i).getNameDescription());
                petArrayList.get(i).play();
            }
        }
    }

    public static void playPet() {
        for (int i = 0; i < petArrayList.size(); i++) {
            petArrayList.get(i).play();
        }
    }

    public static void letAnimalSleep() {
        for (int i = 0; i < petArrayList.size(); i++) {
            petArrayList.get(i).sleep();
        }
    }

    public static void tick() {
        for (int i = 0; i < petArrayList.size(); i++) {
            petArrayList.get(i).tick();
        }
    }

}
