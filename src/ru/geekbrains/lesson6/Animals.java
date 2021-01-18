package ru.geekbrains.lesson6;

public class Animals {

    protected   String name;
    protected int runDistance;
    protected int jumpHeight;
    protected int swimDistance;

    public Animals(String name, int runDistance, int jumpHeight, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }
    public boolean run(int distance){
        return (distance <= this.runDistance);
    }
    public boolean jump(int height) {
        return (height <= this.jumpHeight);
    }
    public boolean swim(int distance){
        return (distance <= this.swimDistance);
    }

    public void printInfo(){
        System.out.println(this);
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{" +
                ", runDistance=" + runDistance +
                ", jumpHeight=" + jumpHeight +
                ", swimDistance=" + swimDistance +
                "}";
    }
}

