package sda.condition;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a magic number: ");
        int magicNumber = scanner.nextInt();
        switch(magicNumber){
            case 0:
                System.out.println("0 is not a magic number");
                break;
            case 5:
                System.out.println("Good one, but still not magic");
                break;
            case 7:
            case 9:
                System.out.println("Cool stuff. But no");
                break;
            case 42:
                System.out.println("Yes!!!!");
                break;
            default:
                System.out.println("No.");
                break;
        }
    }
}
