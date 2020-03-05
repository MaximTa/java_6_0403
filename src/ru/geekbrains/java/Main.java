package ru.geekbrains.java;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(60);
        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Caton", 22,false);
        catsArray[1] = new Cat("Catyan", 25, false);
        catsArray[2] = new Cat("Cotofey", 23, false);
        catsArray[3] = new Cat("Porfiriy", 10, false);
        catsArray[4] = new Cat("Poligraf", 5, false);

        for (Cat item : catsArray) {

            item.eat(plate);

        }

        plate.info();
        plate.increaseFood(25);
        plate.info();
        for (Cat item : catsArray) {
            if (item.getFullness() != true) {
                item.eat(plate);
            }
        }
        plate.info();
    }
}
