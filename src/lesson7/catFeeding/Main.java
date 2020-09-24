package lesson7.catFeeding;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 10);
        Cat murka = new Cat("Murka", 5);
        Cat musya = new Cat("Musya", 5);
        Cat garfield = new Cat("Garfield", 15);

        //Women's family after 40years with no boyfriend
        Cat[] cats = {barsik, murka, musya, garfield};


        Plate plate = new Plate(20);
        plate.info();

        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
            plate.info();
        }

        addFood(plate, 15);

        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
            plate.info();
        }
    }

    public static void addFood(Plate plate, int food){
        plate.increaseFood(food);
    }
}
