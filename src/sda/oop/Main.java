package sda.oop;

public class Main {
    public static void main(String[] args){
        String[] firstName = {"Testas", "Jonas", "Petras"};
        String[] lastName = {"Testinis", "Jonaitis", "Petrauskas"};
        int[] age = {20, 25, 19};

        for(int i = 0; i<3; i++){
            System.out.printf("%s %s - %s\n", firstName[i], lastName[i], age[i]);
        }

        System.out.println("-------------------------------------");
        Student[] students = new Student[3];
        students[0] = new Student("Testas", "Testinis", 20);
        students[1] = new Student("Jonas", "Jonaitis", 25);
        students[2] = new Student("Petras", "Petrauskas", 19);

        //students[1].firstName = "Baravykas";

        System.out.println(students[1].getFirstName());

        for(Student student : students){
            student.printInfo();
        }

        System.out.println("Students count: " + Student.count);
    }
}
