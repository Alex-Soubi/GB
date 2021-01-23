package ru.geekbrains.lesson6;

public class Dog extends Animals {
    public static final String NAME = "Dog";
    public static final int MAX_RUN_DISTANCE = 500;
    public static final int MAX_JUMP_HEIGHT = 1;
    public static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name, int runDistance, int jumpHeight, int swimDistance) {
        super(name, runDistance, jumpHeight, swimDistance);
    }
    public Dog() {
        this(NAME,MAX_RUN_DISTANCE, MAX_JUMP_HEIGHT,MAX_SWIM_DISTANCE);
    }

    @Override
    public boolean run(int distance) {
        if (distance <= this.runDistance) {
            System.out.println("Сбака: " + this.name + " пробежала дистанцию: " + distance);
            return true;
        }
        else {
            System.out.println("Сбака: " + this.name + " не пробежала дистанцию: " + distance);
                    return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= (this.runDistance)) {
            System.out.println("Сбака: " + this.name + " перепрыгнула препятствие: " + height);
            return true;
        }
        else {
            System.out.println("Сбака: " + this.name + " не перепрыгнула препятствие: " + height);
            return false;
        }
    }

    @Override
    public boolean swim(int distance) {
        if (distance <= this.runDistance) {
            System.out.println("Сбака: " + this.name + " проплыла дистанцию: " + distance);
            return true;
        }
        else {
            System.out.println("Сбака: " + this.name + " не проплыла дистанцию: " + distance);
            return false;
        }
    }
}
