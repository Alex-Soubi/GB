package ru.geekbrains.lesson6;

import java.util.Random;

public class AnimalsTest {
    public static void main(String[] args) {
        Animals[] animal = animalConstrukt();
        start(animal);
    }


    private static Animals[] animalConstrukt() {
        return new Animals[]{
                new Dog(),
                new Dog("Kasya", 500, 1, 20),
                new Cat("Coco", 250, 4,Cat.MAX_SWIM_DISTANCE)};
    }

    public static void start(Animals[] animal) {
        Random random = new Random();
        for (Animals animals : animal) {
            animals.printInfo();
            System.out.println(animals.run(random.nextInt(500)));
            System.out.println(animals.jump(random.nextInt(5)));
            System.out.println(animals.swim(random.nextInt(200)));
            System.out.println();
        }

    }
}