package sda.task5;

public class Main {
    public static void main(String[] args){
        Dog tobis = Dog.createDog("Tobis", "Lietuvos lenciūginis", 5);
        tobis.bark();

        tobis.age = 3;

        tobis.bark();


        Room bedroom = new Room(3, 2.637, 5);

        double surfaceArea = bedroom.surfaceArea();
        double volume = bedroom.volume();

        bedroom.print();
    }
}
