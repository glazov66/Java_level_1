package hw6_glazov;

public class Animal {

    public String name;
    protected int runMaxDist;
    protected int swimMaxDist;
    protected double jumpMaxHigh;

    public Animal(String name, int runMaxDist, int swimMaxDist, double jumpMaxHigh) {

        this.name = name;
        this.runMaxDist = runMaxDist;
        this.swimMaxDist = swimMaxDist;
        this.jumpMaxHigh = jumpMaxHigh;
    }

    public void run(int runDist) {
        System.out.println("Животное плывет");
    }

    public void swim(int swimDist) {

        System.out.println("Животное плывет");
    }

    public void jump(double jumpHigh) {

        System.out.println("Животное прыгает");
    }
}
