package sda.task3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        Random rand = new Random();
        int[] array = new int[300];

        for(int i = 0; i<array.length; i++){
            array[i] = rand.nextInt(100);
        }

        for(int a : array){
            System.out.println(a);
        }
    }
}
