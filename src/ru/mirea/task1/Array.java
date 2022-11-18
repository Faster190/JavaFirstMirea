package ru.mirea.task1;

public class Array {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int sum = 0, avg;
        for (int j : arr) {
            sum += j;
        }
        avg = sum/arr.length;
        System.out.println("Сумма элеменьов = "+sum+" Среднее арифметическое = "+avg);
    }
}