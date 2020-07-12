package sda.task5;

public class Room {
    double width;
    double height;
    double length;

    // Tuščias konstruktorius (nieko nedaro)
    public Room(){

    }

    // Konstruktorius užstatantis reikšmes
    public Room(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double surfaceArea(){
        return width * length;
    }

    public double volume(){
        return width * height * length;
    }

    public void print(){
        System.out.printf("Surface area: %.1f Volume: %.2f\n", surfaceArea(), volume());
    }
}
