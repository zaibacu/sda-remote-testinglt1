package sda;

public class Task1 {
    public static void main(String[] args){
        int yearNow = 2020;
        int birthYear = 2005;

        int monthNow = 6;
        int monthBirth = 8;

        // > 18
        if(yearNow - birthYear > 18){
            System.out.println("Here you go");
        }
        else{
            // < 18
            if(yearNow - birthYear < 18){
                System.out.println("Too young");
            }
            // = 18
            else {

            }
        }
    }
}
