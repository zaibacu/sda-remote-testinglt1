package sda.task5;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark(){
        if(age < 5){
            System.out.println("Woof Woof");
        }
        else {
            System.out.println("Au au!");
        }
    }

    // Advanced
    public static boolean isValid(String name, String breed, int age){
        if(age < 0){
            return false;
        }

        if(name.length() < 3){
            return false;
        }

        return true;
    }

    public static Dog createDog(String name, String breed, int age){
        if(isValid(name, breed, age)){
            return new Dog(name, breed, age);
        }
        else {
            return null;
        }
    }
}
