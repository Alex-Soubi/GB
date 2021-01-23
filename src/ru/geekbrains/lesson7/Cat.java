package ru.geekbrains.lesson7;

public class Cat {

    private final String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }



    public void eat(Plate plate) {
       if (plate.chekEat(getAppetite()) == true) {
           doEat(plate);
        }
       
        else {
           System.out.println("Кот " + this.name + " не может поесть, т.к. еды не достаточно, но это не страшно, сейчас мы добавим еды в тарелку");
           plate.addFood();
           plate.info();
           if (plate.chekEat(getAppetite()) == true) {
               doEat(plate);
           }
           else System.out.println("У нас не достаточно еды что бы  накормить " + this.name);
       }
    }

    public void doEat(Plate plate) {
        System.out.println(this.name + " is eating...");
        plate.decreaseFood(getAppetite());
        appetite = 0;
        satiety = true;
        System.out.println("Кот сыт!");
        plate.info();
    }

}
