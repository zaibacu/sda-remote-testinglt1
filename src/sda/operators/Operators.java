package sda.operators;

public class Operators {
    public static void main(String[] args){
        int a = 20;
        System.out.println("5 == 5: " +  (5 == 5));
        System.out.println("3 >= 4: " +  (3 >= 4));
        System.out.println("a >= 18 " +  (a >= 18));

        boolean sunIsShinning = true;
        boolean fullMoon = true;

        if(sunIsShinning && a >= 18){
            System.out.println("Have a nice day");
        }
        else if(sunIsShinning || fullMoon){
            System.out.println("Yey");
        }
        else{
            System.out.println("Good luck");
        }
    }
}
