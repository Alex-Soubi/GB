package ru.geekbrains.lesson6;

public class Cat extends Animals {
    public static final String NAME = "Cat";
    public static final int MAX_RUN_DISTANCE = 200;
    public static final int MAX_JUMP_HEIGHT = 2;
    public static final int MAX_SWIM_DISTANCE = 0;

    public Cat(String name, int runDistance, int jumpHeight, int swimDistance) {
        super(name, runDistance, jumpHeight, MAX_SWIM_DISTANCE);
    }
    public Cat() {
        this(NAME,MAX_RUN_DISTANCE, MAX_JUMP_HEIGHT,MAX_SWIM_DISTANCE);
    }
    @Override
    public boolean run(int distance) {
        if (distance <= this.runDistance) {
            System.out.println("Кот: " + this.name + " пробежал дистанцию: " + distance);
            return true;
        }
        else {
            System.out.println("Кот: " + this.name + " не пробежал дистанцию: " + distance);
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= (this.runDistance)) {
            System.out.println("Кот: " + this.name + " перепрыгнул препятствие: " + height);
            return true;
        }
        else {
            System.out.println("Кот: " + this.name + " не перепрыгнул препятствие: " + height);
            return false;
        }
    }

    @Override
    public boolean swim(int distance) {
            System.out.println("Коты не умеют плавать!");
            return false;
        }

}
