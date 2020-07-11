package sda.task1;

public class Main {
    public static int sum(int[] array){
        int sum = 0;
        for(int a : array){
            sum += a;
        }
        return sum;
    }

    public static int sum2(int ... array){
        int sum = 0;
        for(int a : array){
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args){
        int d = sum(new int[]{1, 2, 3, 4, 5});
        int e = sum2(1, 2, 3, 4, 5);

        System.out.println(d);
        System.out.println(e);
    }
}
