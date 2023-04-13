package String10;

public class Q1 {

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private int age;
    private PetType type;

    public Pet(String name, int age, PetType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PetType getType() {
        return type;
    }

    public String toString() {
        return String.format("%s (%s) - %d years old", name, type, age);
    }
}

enum PetType {
    CAT,
    DOG
}

public class Main {
    public static void main(String[] args) {
        String[] petData = {
            "みみ, 10, DOG",
            "レオ, 1, CAT",
            "マル, 2, CAT"
        };

        List<Pet> pets = new ArrayList<>();

        for (String data : petData) {
            String[] parts = data.split(", ");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            PetType type = PetType.valueOf(parts[2]);

            Pet pet = new Pet(name, age, type);
            pets.add(pet);
        }

        System.out.println(pets);
    }
}

