package spring_test;

public class Semple {
    private static int constructorCounter = 0;
    private  int counter = 0;

    public Semple(){
        constructorCounter++;
    }

    public static int getConstructorCounter() {
        return constructorCounter;
    }

    public int getCounter() {
        return ++counter;
    }
}
