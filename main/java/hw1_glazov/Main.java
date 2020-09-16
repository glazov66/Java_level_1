package hw1_glazov;

public class Main {

    public static void main(String[] args) {

//     Homework ex.2;

        byte varA = 5;
        short varB = 245;
        int varC = 2020;
        long varD = 456123562124L;
        float varE = 320.2f;
        double varF = 325.5;
        char chA = 25645;
        char chB = 'S';
        boolean val = true;

//     Homework ex.3;

        public static int calculate ( int a, int b, int c, int d){
            calculate = a * (b + (c / d));
        }
// Homework ex.4
        public static boolean task10to20(int x, y) {
            if ((x + y) >= 10 && (x + y) <= 20) {
                System.out.println("true");
            } else  {
                System.out.println("false");
            }
        }
// Homework ex.5
        public static boolean positiveOrNegative(int i){
            if (i >= 0) {
                System.out.println("Положительное число");
            } else {
                System.out.println("Отрицательное число");
            }
        }

// Homework ex.6
        public static boolean negative(int j) {
            return j < 0;
        }

// Homework ex.7
        public static void hiName(String name) {
            name = "ИМЯ"
            System.out.printf("Привет, %s!" name);
        }
    }
}
