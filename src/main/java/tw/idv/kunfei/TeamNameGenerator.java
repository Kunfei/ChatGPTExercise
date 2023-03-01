package tw.idv.kunfei;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TeamNameGenerator {
    private static String[] ADJECTIVES = { "Enthusiastic", "Innovative", "Excellent", "Famous", "Passionate",
            "Open-minded", "Creative", "Energetic", "Dynamic", "Reliable", "Courageous", "Ambitious", "Empathetic",
            "Friendly", "Productive", "Resourceful", "Responsible", "Supportive", "Trustworthy", "Versatile" };

    private static String[] ANIMALS = { "Lion", "Tiger", "Panda", "Dog", "Cat", "Bird", "Eagle", "Elephant",
            "Gorilla", "Horse", "Kangaroo", "Leopard", "Monkey", "Penguin", "Raccoon", "Rhino", "Shark", "Snake",
            "Turtle", "Wolf" };

    static int adjectiveIndex = 0;
    static int animalIndex = 0;
    static {
        Random random = new Random();
        Collections.shuffle(Arrays.asList(ADJECTIVES));
        adjectiveIndex = random.nextInt(ADJECTIVES.length);
        Collections.shuffle(Arrays.asList(ANIMALS));
        animalIndex = random.nextInt(ANIMALS.length);
    }
    public static String generateTeamName() {
        String adjective = ADJECTIVES[adjectiveIndex];
        adjectiveIndex = (adjectiveIndex + 1) % ADJECTIVES.length;
        String animal = ANIMALS[animalIndex];
        animalIndex = (animalIndex + 1) % ANIMALS.length;
        return adjective + " " + animal;
    }
}

