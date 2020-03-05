package ru.geekbrains.java;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        if (food > 0) {
            System.out.println("Food: " + food);
        } else {
            System.out.println("Not food");
        }
    }

    public boolean decreaseFood(int amount) {
        int difference = food - amount;
        if (difference < 0) {
            return false;
        }
        food -= amount;
        return true;
    }

    public void increaseFood(int amount) {
        food += amount;
    }

    public int getFood() {
        return food;
    }

}
