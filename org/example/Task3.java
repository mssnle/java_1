package org.example;
import java.util.Scanner;
public class Task3 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double n1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double n2 = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double n3 = scanner.nextDouble();

        double min;
        if (n1 <= n2 && n1 <= n3) {
            min = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            min = n2;
        } else {
            min = n3;
        }

        double max;
        if (n1 >= n2 && n1 >= n3) {
            max = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            max = n2;
        } else {
            max = n3;
        }

        System.out.println("Наименьшее: " + min);
        System.out.println("Наибольшее: " + max);


    }
}