package hw7_glazov;

public class Test {

    public static void main(String[] args) {
        final int SIZE = 3;

        Cat[] cat = new Cat[SIZE];
        cat[0] = new Cat("Мартин", 7, 0);
        cat[1] = new Cat("Борис", 12, 0);
        cat[2] = new Cat("Рыжий", 7, 0);

        Plate plate = new Plate(22);
        int ADDFOOD = 9;

        plate.info();

        for (int i = 0; i < SIZE; i++) {
             System.out.println('\n' + "Для кота " + cat[i].name + " в миске (plate) " + plate.getFood() + " шт. еды.");

            if (plate.getFood() <= 0) {
                System.out.println("В МИСКЕ КОНЧИЛАСЬ ЕДА!");
                cat[i].restToEat = cat[i].maxAppetite;
                break;
            }

//            if (plate.getFood() < cat[i].currentAppetite) {
//                System.out.println("В миске мало еды. Надо добавлять ещё!");
//                break;
//            }

            cat[i].eat(plate);
            System.out.println("После кота " + cat[i].name + " остаток ");
            plate.info();
        }
        System.out.println("После первого цикла остаток ");
        plate.info();

        System.out.println('\n' + "Добавляем ещё " + ADDFOOD + " шт. еды.");
        plate.addFood(ADDFOOD);
        plate.info();

        for (int j = 0; j < SIZE; j++) {
            if (cat[j].restToEat == 0) {
                System.out.println("КОТ " + cat[j].name + " СЫТ! =)");
                j = j + 1;
                if (j >= SIZE) {
                    break;
                }
                if (cat[j].restToEat == 0) {
                    System.out.println("КОТ " + cat[j].name + " СЫТ! =)");
                    j = j + 1;
                    if (j >= SIZE) {
                        break;
                    }
                }
            }

            System.out.println('\n' + "Для кота " + cat[j].name + " в миске (plate) " + plate.getFood() + " шт. еды.");

            System.out.println("restToEat = " + cat[j].restToEat);

            if (plate.getFood() <= 0) {
                System.out.println("В миске кончилась еда!");
                break;
            }

//            if (plate.getFood() < cat[j].currentAppetite) {
//                System.out.println("В миске мало еды");
//                break;
//            }

            cat[j].eat(plate);
            System.out.println("После кота " + cat[j].name + " остаток ");
            plate.info();
        }
        System.out.println("После второго цикла остаток ");
        plate.info();

    }
}
