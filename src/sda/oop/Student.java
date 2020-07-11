package sda.oop;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public static int count = 0;

    Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        count++;
    }

    public void printInfo(){
        System.out.printf("%s %s - %s\n", firstName, lastName, age);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }
}
