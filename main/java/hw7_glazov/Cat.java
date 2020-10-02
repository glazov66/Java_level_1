package hw7_glazov;

public class Cat {

    protected final String name;
    public int maxAppetite;
    public int currentAppetite;
    private int full;
    int restToEat;

    public Cat(String name, int maxAppetite, int full) {
        this.name = name;
        this.maxAppetite = maxAppetite;
        this.currentAppetite = currentAppetite;  // текущий аппетит перед очередным приемом пищи
        this.full = full;              // показатель сытости кота (сколько всего съел)
        this.restToEat = restToEat;     //осталось съесть до полной сытости после приема пищи
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return maxAppetite;
    }

    public void eat(Plate plate) {

        currentAppetite = maxAppetite - full;
        System.out.println(name + " maxApp = " + maxAppetite);
        System.out.println("full = " + full);
        System.out.println("currentApp " + currentAppetite);

//        if (currentAppetite == 0) {
//            System.out.println("Кот " + name + " сыт");
//

//        }
//        if (plate.getFood() < currentAppetite) {
//            System.out.println("В миске мало еды");
//        }
        System.out.println("Кот " + name + " питается");
        doEat(plate);
    }

    private void doEat(Plate plate) {
        int dose = 0;           // сколько съедает за текущий подход к миске
        for (full = full; full < maxAppetite; ) {
            full = full + 1;
            dose = dose + 1;
            if (dose >= plate.food) {
                break;
            }
        }
        restToEat = maxAppetite - full;
        System.out.println("Кот " + name + " съел " + dose);
        System.out.println("Ему осталось съесть ещё " + restToEat);

        plate.decreaseFood(dose);

    }
}
