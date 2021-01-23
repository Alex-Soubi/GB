package ru.geekbrains.lesson7;

public class TestEatCat {
    public static void main(String[] args) {
        Plate plate = new Plate(15);
        plate.info();
        Cat[] cat = hungryCats();
        catsEating(cat, plate);


    }
    private static Cat[] hungryCats() {
        return new Cat[] {
                new Cat("Basya", 3),
                new Cat("Sara", 16),
                new Cat("Pushok", 44),
                new Cat("Oblachko", 17)
        };

    }
    public static void catsEating(Cat[] cat,Plate plate) {
        for (Cat cats:
             cat) {
            cats.eat(plate);
        }
    }
}
