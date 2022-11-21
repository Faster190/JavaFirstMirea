package ru.mirea.task1;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива:");
        int n = s.nextInt();
        int[] arr = new int[n];
        int counter = 0;
        while (counter<n){
            System.out.println("Введите "+(counter+1)+" элемент массива:");
            arr[counter] = s.nextInt();
            counter++;
        }
        int min = arr[0], max = min;
        counter = 1;
        do{
            if(min>arr[counter]) min=arr[counter];
            if(max<arr[counter]) max=arr[counter];
            counter++;
        }while(counter<n);
        System.out.println("Максимальный элемент массива = "+max+" Минимальный элемент массива = "+min);
    }
}
