package org.example;
import java.util.Scanner;
public class Task2 {
    public void main() {
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    double y = Math.exp(x * x) + Math.sqrt(4*x/8);
    System.out.println(y);
}}
//вариант 9