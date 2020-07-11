package sda.task4;

public class Task4 {
    public static void main(String[] args){
        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                if(i == j){
                    continue;
                }

                if(array[i] + array[j] == 3){
                    System.out.printf("i=%s j=%s\n", i, j);
                }

            }
        }
    }
}
