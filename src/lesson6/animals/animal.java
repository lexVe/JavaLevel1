package lesson6.animals;

public abstract class animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected int jumpLimit;

    animal(String name, int runLimit, int swimLimit, int jumpLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    protected void run(int length){
        System.out.println(name + " пробежал " + length + " м");
        System.out.println(checkTF(length, runLimit));
    }

    protected void swim(int length){
        System.out.println(name + " проплыл " + length + " м");
        System.out.println(checkTF(length, swimLimit));
    }

    protected void jumpOver(int high){
        System.out.println(name + " перепрыгнул через " + high + " м");
        System.out.println(checkTF(high, jumpLimit));
    }

    protected boolean checkTF(int needed, int possible){
        if (needed<=possible)
            return true;
        else if(needed>possible)
            return false;
    }





}
