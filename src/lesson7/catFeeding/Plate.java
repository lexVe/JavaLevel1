package lesson7.catFeeding;

public class Plate {
    protected static int food;

    Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int n) {

        food -= n;

    }

    public void increaseFood(int food) {
        this.food += food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
