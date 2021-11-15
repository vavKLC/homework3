package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = {-1.2,32.2,-12.2,53.12,-2.3,-15.4,4.3,29.8,123.1,-224.2,-64.12,87.12,77.7,99.9,-123.123};
        double sum = 0;
        int negativeNumbers = 0;
        boolean negative = false;
        for (double d : array) {
            if (d < 0) {
                negative = true;
            } else {
                if (negative) {
                    negativeNumbers++;
                    sum += d;
                }
            }



        }
        System.out.println("Среднее арифметическое: " + sum / negativeNumbers);

        int number[] = {12,32,6,21,3,0,1,91};
        for(int i = number.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( number[j] > number[j+1] ){
                int temp = number[j];
                number[j] = number[j+1];
                number[j+1] = temp;
                }
                System.out.println(Arrays.toString(number));
            }
        }
    }
}






