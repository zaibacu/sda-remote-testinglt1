package sda.coffee;

public class Main {
    private static void boilWater(){
        System.out.println("Boiling water");
    }

    private static void grindBeans(){
        System.out.println("Grinding beans");
    }

    private static void pourWater(){
        System.out.println("Pouring water");
    }

    public static void pourHotWater(){
        boilWater();
        pourWater();
    }

    public static void americano(){
        boilWater();

        grindBeans();
        pourWater();

        grindBeans();
        pourWater();

        pourWater();
    }

    public static void blackCoffee(){
        boilWater();

        grindBeans();

        pourWater();
        pourWater();
    }

    public static void espresso(){
        boilWater();
        grindBeans();
        pourWater();
    }

    public static void main(String[] args) {
        americano();
    }
}
