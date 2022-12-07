/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n)

* */
import java.util.Scanner;


public class dz1 {
    public static void main(String[] args) {
        int res = sum_triangle();
        System.out.println(res);


    }

    public static int sum_triangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        double result = 0.5 * num * (num + 1);
        in.close();

        return (int) result;
    }



}




