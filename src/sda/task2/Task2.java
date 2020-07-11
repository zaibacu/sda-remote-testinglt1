package sda.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number 0-9: ");
        int number = scanner.nextInt();

        if(number >= 0 && number <= 9){
            switch(number){
                case 3:
                case 5:
                    System.out.println("Special message");
                    break;
                default:
                    System.out.println("Ok.");
                    break;
            }
        }
        else{
            System.out.println("Incorrect number");
        }
    }
}
