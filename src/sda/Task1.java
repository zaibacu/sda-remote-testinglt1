package sda;

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LocalDate now = LocalDate.now();

        int yearNow = now.getYear();
        int birthYear;

        int monthNow = now.getMonthValue();
        int monthBirth;

        System.out.println("What is your birth year?");
        birthYear = scanner.nextInt();

        // > 18
        int deltaYear = yearNow - birthYear;
        if(deltaYear > 18){
            System.out.println("Here you go");
        }
        else{
            // < 18
            if(deltaYear < 18){
                System.out.println("Too young");
            }
            // = 18
            else {
                System.out.println("What is your birth month?");
                monthBirth = scanner.nextInt();
                if(monthNow - monthBirth > 0){
                    System.out.println("Here you go");
                }
                else {
                    System.out.println("Too young");
                }
            }
        }
    }
}
