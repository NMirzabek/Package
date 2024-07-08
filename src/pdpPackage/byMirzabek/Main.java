package pdpPackage.byMirzabek;

import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat(2, "Black", "fly", 20, "Night");
        Eagle eagle = new Eagle(2, "Dark Brown", "Fly", 2, "Day");
        Cat cat = new Cat(4, "Tabby", "Basir", 30);
        Dog dog = new Dog(4, "Black", "Chapa", 10);
        Straus straus = new Straus(2, "Black", "Walks", 10, 900);

        Animal animal = new Animal(4,"Black");
        Pet pet = new Pet(4, "White", "CatDog");
        Bird bird = new Bird(2, "Brown", "Fly", 1.5);

        boolean Bat = false;
        System.out.println(Bat);
        //all of them are objects that are using the proper
        // ties of the animal;

    }
}
