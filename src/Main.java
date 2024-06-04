import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        int[] allSalary = {66000, 49500, 48700, 45000, 75000};
        System.out.println("Задача-1");
        int salary = 0;
        for (int i = 0; i < allSalary.length; i++) {
            salary += allSalary[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей", salary);
        System.out.println();
        System.out.println("Задача-2");
        int minSalary = allSalary[0];
        int maxSalary = allSalary[0];
        for (int i = 0; i < allSalary.length; i++) {
            if (allSalary[i] < minSalary) {
                minSalary = allSalary[i];
            }
            if (allSalary[i] > maxSalary)
                maxSalary = allSalary[i];
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей", minSalary);
        System.out.println();
        System.out.printf("Максимальная сумма трат за неделю составила %s рублей", maxSalary);

        System.out.println();
        System.out.println("Задача-3");
        int salary2 = 0;
        for (int i = 0; i < allSalary.length; i++) {
            salary2 += allSalary[i];
        }
        double average = (double) salary2 / allSalary.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей", average);

        System.out.println();
        System.out.println("Задача-4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char rev = 0;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            rev += reverseFullName[i];

        System.out.print(reverseFullName[i]);
    }
}}