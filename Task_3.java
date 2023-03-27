// Task_3.
// Реализовать простой калькулятор (+,-,/,*), только с целыми числами.

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите математическое действие: ");
        String action = sc.next();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        switch (action) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                double num = a;
                System.out.println(num / b);
                break;    
            default:
                System.out.println("Некорректный ввод!");
                break;
        }
        sc.close();
    }
}
