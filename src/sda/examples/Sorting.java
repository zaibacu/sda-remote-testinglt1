package sda.examples;

public class Sorting {
    public static void main(String[] args){
        int[] array = {5, 8, 1, 0, 6, 4}; // {0, 8, 1, 5, 6, 4}

        for(int i = 0; i<array.length; i++){
            int minIdx = i;
            for(int j = i; j<array.length; j++){
                if(array[j] < array[minIdx]){
                    minIdx = j;
                }
            }
            int t = array[i];
            array[i] = array[minIdx];
            array[minIdx] = t;
        }
    }
}
