package shelter;

public class VirtualPet {

    private int hunger;
    private int thirst;
    private int play;
    private int sleep;
    private String animalName;
    private String animalDescription;

    public VirtualPet(int hunger, int thirst, int play, int sleep, String animalName, String animalDescription) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.play = play;
        this.sleep = sleep;
        this.animalName = animalName;
        this.animalDescription = animalDescription;
    }

    void feed() {
        hunger = hunger - 2;
    }

    int getHunger() {
        return hunger;
    }

    void water() {
        thirst = thirst - 2;
    }

    int getThirst() {
        return thirst;
    }

    void play() {
        play = play - 2;
    }

    int getPlay() {
        return play;
    }

    void sleep() {
        sleep = sleep - 2;
    }

    int getSleep() {
        return sleep;
    }

    String getName() {
        return animalName;
    }

    String getNameDescription() { return animalDescription;
    }

    void tick() {
        hunger = hunger + 1;
        thirst = thirst + 1;
        play = play + 1;
        sleep = sleep + 1;
    }
}