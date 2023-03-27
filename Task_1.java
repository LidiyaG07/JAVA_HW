// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. 
// Используя данные из массива найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i ++) {
            arr[i] = (i + 1) * (i + 1) * (i + 1);
        }
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        int cub1 = arr[num1 - 1];
        int cub2 = arr[num2 - 1];
        System.out.println("Куб первого числа: " + cub1);
        System.out.println("Куб второго числа: " + cub2);
        sc.close();
    }
    

}