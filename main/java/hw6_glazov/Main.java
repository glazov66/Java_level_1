package hw6_glazov;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 200, 0, 2);
        Dog dog1 = new Dog("Барбос", 400, 10, 0.5);
        Dog dog2 = new Dog("Белка", 600, 25, 1.5);


        int runDist = 270;
        int swimDist = 14;
        double jumpHigh = 1.2;

        cat1.run(runDist);
        dog1.run(runDist);
        dog2.run(runDist);

        cat1.swim(swimDist);
        dog1.swim(swimDist);
        dog2.swim(swimDist);

        cat1.jump(jumpHigh);
        dog1.jump(jumpHigh);
        dog2.jump(jumpHigh);


    }


}
