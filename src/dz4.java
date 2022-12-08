/*
Реализовать простой калькулятор
("введите первое число"... "Введите второе число"... "укажите операцию,
которую надо выполнить с этими числами"... "ответ: ...")
 */


import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();
        double res = 0;
        System.out.print("Input operation (+,-,/,*): ");
        String opera = in.next();

        if (Objects.equals(opera, "+")){
            res = sum (a,b);
        }

        if (Objects.equals(opera, "-")){
            res = sub (a,b);
        }
        if (Objects.equals(opera, "*")){
            res = mult (a,b);
        }
        if (Objects.equals(opera, "/")){
            res = div (a,b);
        }
        else System.out.println("You input cannot write operation! Try again.");
        System.out.print("results:");
        System.out.printf(String.valueOf(res));


        in.close();


    }
    public static double sum (double a, double b){
        return a + b;
    }
    public static double sub (double a , double b){
        return a - b ;
    }
    public static double mult (double a, double b){
        return a * b;
    }
    public static double div (double a, double b) {
        return a / b;
    }

}
