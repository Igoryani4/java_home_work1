/*
Вычислить n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        int res =  factorial();
        System.out.println(res);

    }
    public static int factorial(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int result = 1;
        if (num == 1){
            return 1;

        }
        else{
            for (int i = 2; i < num + 1 ; i++) {
                result *= i;
            }

        }
        in.close();

        return result;
    }
}
