package hw6_glazov;

public class Cat extends Animal {
    protected int runDist;
    protected int swimDist;
    protected int jumpHigh;

    public Cat(String name, int runMaxDist, int swimMaxDist, double jumpMaxHigh) {
        super(name, runMaxDist, swimMaxDist, jumpMaxHigh);
        this.name = name;
        this.runDist = runDist;
        this.swimDist = swimDist;
        this.jumpHigh = jumpHigh;
    }


    @Override
    public void run(int runDist) {
        System.out.println("1. Забег на " + runDist + " метров.");
        if (runDist <= runMaxDist) {
            System.out.println("Кот побежал на дистанцию " + runDist + " м.");
        } else System.out.println("Кот столько не пробежит. Он пробегает не больше " + runMaxDist+ " м.");
    }

    @Override
    public void swim(int swimDist) {
        System.out.println("\n" + "2. Заплыв на " + swimDist + " метров.");
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void jump(double jumpHigh) {

        System.out.println("\n" + "3. Прыжок на " + jumpHigh + " м.");
        if (jumpHigh <= jumpMaxHigh) {
            System.out.println("Кот прыгает на " + jumpHigh + " м.");
        } else System.out.println("Кот на такую высоту не сможет прыгнуть. Он прыгает не выше " + jumpMaxHigh + " м.");


    }
}
