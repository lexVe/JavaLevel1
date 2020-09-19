package lesson6.animals;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Ободранка", 200, 1, 4);
        cat1.run(100);
        cat1.run(200);
        cat1.run(250);
        cat1.swim(1);
        cat1.swim(5);
        cat1.jumpOver(5);
        cat1.jumpOver(10);

        Dog dog1 = new Dog("Блохастый", 500, 20, 6);
        dog1.run(450);
        dog1.run(500);
        dog1.run(550);
        dog1.swim(15);
        dog1.swim(20);
        dog1.swim(25);
        dog1.jumpOver(5);
        dog1.jumpOver(6);
        dog1.jumpOver(7);

        Cat cat2 = new Cat("Шкура", 250, 2, 5);
        cat2.run(100);
        cat2.run(250);
        cat2.run(280);
        cat2.swim(2);
        cat2.swim(5);
        cat2.jumpOver(5);
        cat2.jumpOver(10);

        Dog dog2 = new Dog("Огрызок", 300, 15, 4);
        dog2.run(200);
        dog2.run(300);
        dog2.run(550);
        dog2.swim(10);
        dog2.swim(15);
        dog2.swim(25);
        dog2.jumpOver(3);
        dog2.jumpOver(4);
        dog2.jumpOver(5);
    }
}
