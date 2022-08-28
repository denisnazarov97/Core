package Task1;

import java.util.Random;

public class Main {
    public static void main (String[] args){
        double[][] a = new double[5][5];
        double max, min;
        double maxa = a [0][0];
        double mina = a[0][0];
        double avg = 0;
        Random rnd = new Random();
        for (int i=0;i < a.length;i++) {
            for (int j=0;j < a[i].length;j++) {
                a[i][j]=rnd.nextInt(10);
            }
        }
        for (int i=0;i < a.length;i++,System.out.println()) {
            for (int j=0;j < a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
        }

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if (maxa < a[i][j]){
                    maxa = a[i][j];
                }
                else if(mina > a[i][j]){
                    mina = a[i][j];
                }
                avg += a[i][j]/(a.length*a.length);
            }
        }
        System.out.println("Максимальный элемент двумерного массива " + maxa);
        System.out.println("Минимальный элемент двумерного массива " + mina);
        System.out.println("Cреднее значение двумерного массива:" + avg);
    }
}



