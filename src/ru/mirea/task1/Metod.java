package ru.mirea.task1;
import java.util.Scanner;

public class Metod {
    static int factorial(int n){
        int a = 1;
        for(int i = 2; i<=n; i++){
            a = a * i;
        }
        return a;
    }

    public static void main(String[] args){
        System.out.print("Введите число:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Факториал числа:"+ factorial(n));
    }
}
