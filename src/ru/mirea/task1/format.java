package ru.mirea.task1;
import java.text.DecimalFormat;

public class format {
    public static void main(String[] args){
        DecimalFormat form = new DecimalFormat("#.####");
        for(int i = 1; i<=10; i++) {
            double n = 1./i;
            System.out.print(form.format(n)+"; ");
        }
    }
}
