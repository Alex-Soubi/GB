package ru.geekbrains.lesson7;

import java.util.Random;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println("Plate: " + food);
    }

    public void decreaseFood(int appetite) {
        this.food -= appetite;
    }
    public boolean chekEat(int appetite) {
        if (this.food >= appetite) return true;
        else return false;
    }
    public void addFood() {
        Random random = new Random();
        this.food += random.nextInt(100);
    }
}
