package hw5_glazov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Worker[] workerArray = new Worker[5];
        workerArray[0] = new Worker("1", "Petrov", "CEO", "chef@company.com", "84951234567", 100000, 45);
        workerArray[1] = new Worker("2", "Sidorov", "CFO", "fin@company.com", "84951234568", 80000, 43);
        workerArray[2] = new Worker("3", "Bykov", "engineer", "eng@company.com", "84951234570", 65000, 35);
        workerArray[3] = new Worker("4", "Krasnov", "programmer", "prog@company.com", "84951234571", 65000, 32);
        workerArray[4] = new Worker("5", "Popov", "QA", "qa@company.com", "84951234572", 65000, 52);

        int checkAge = 40;
        System.out.println("Сотрудники старше " + checkAge + " лет:" + "\n");
        for (int i = 0; i < 5; i++) {
            if (workerArray[i].age > checkAge) {
                workerArray[i].printInfo();
            }
        }
    }
}

