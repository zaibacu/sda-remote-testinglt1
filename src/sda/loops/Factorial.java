package sda.loops;

public class Factorial {
    public static long factorial(int n){
        if(n == 0){
            return 1;
        }

        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sum(int n){
        int sum = 0;
        if(n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args){
        // 5! = (((1 * 2) * 3) * 4) * 5
        // 3! = 1 * 2 * 3
        // 1! = 1
        // 0! = 1 +
        System.out.println(factorial(25));
    }
}
