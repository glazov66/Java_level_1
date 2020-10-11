package hw6_glazov;

public class Dog extends Animal {

    protected int runDist;
    protected int swimDist;
    protected int jumpHigh;

    public Dog(String name, int runMaxDist, int swimMaxDist, double jumpMaxHigh) {
        super(name, runMaxDist, swimMaxDist, jumpMaxHigh);
        this.name = name;
        this.runDist = runDist;
        this.swimDist = swimDist;
        this.jumpHigh = jumpHigh;
    }

    @Override
    public void run(int runDist) {

        if (runDist <= runMaxDist) {
            System.out.println("Собака " + name + " побежала на дистанцию " + runDist + " м.");
        } else System.out.println("Собака " + name + " столько не пробежит. Она пробегает не больше " + runMaxDist+ " м.");
    }

    @Override
    public void swim(int swimDist) {
        if (swimDist <= swimMaxDist) {
            System.out.println("Собака " + name + " поплыла на " + swimDist + " м.");
        } else System.out.println("Cобака " + name + " столько не сможет проплыть. Она проплывет не больше " + swimMaxDist + " м.");
    }

    @Override
    public void jump(double jumpHigh) {
        if (jumpHigh <= jumpMaxHigh) {
            System.out.println("Собака " + name + " прыгает на " + jumpHigh + " м.");
        } else
            System.out.println("Cобака " + name + " на такую высоту не сможет прыгнуть. Она прыгает не выше " + jumpMaxHigh + " м.");
    }
}

