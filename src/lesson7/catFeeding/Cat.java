package lesson7.catFeeding;

public class Cat {
    private String name;
    private int appetite;
    private boolean fed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fed = false;
    }

    public void eat(Plate p) {
        if (Plate.food >= appetite && fed == false) {
            p.decreaseFood(appetite);
            fed = true;
            System.out.println(name + " is fed");
        }
        else if(fed == true){
            System.out.println(name + " is also fed");
        }
        else {
            System.out.println("Not enough food in plate");
        }
    }
}