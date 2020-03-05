package ru.geekbrains.java;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate plate) {

       if((plate.decreaseFood(appetite) != true) && plate.getFood() < appetite) {
           fullness = false;
        } else {
           fullness = true;
        }
        System.out.println("Cat " + name + " fullness: " + fullness);

    }

       public boolean getFullness(){

        return fullness;
    }

}
