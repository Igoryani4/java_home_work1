/*
Вывести все простые числа от 1 до 1000 (простые числа - это числа
которые делятся только на себя и на единицу без остатка.
Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
 */

import java.util.Arrays;
import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {

        int[] res = natural();
        System.out.println("This is simple numbers");
        System.out.println(Arrays.toString(res));

    }
    public static int[] natural(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input number:");
        int num = in.nextInt();

        int [] array = new int[num/4];

        for (int x = 1, j = 0; x < num + 1 ; x++) {
            int count = 0;
            for (int i = 1; i < x + 1; i++) {
                if (x % i == 0) {
                    count++;

                }
            }
            if (count == 2) {
                array[j] = x;
                j++;

                }




        }

        return array;
    }
}


