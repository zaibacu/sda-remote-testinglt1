package sda.condition;

public class IfElse {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = 2020 - 2002 >= 18;

        if(a){
            System.out.println("A");
        }

        if(b){
            System.out.println("B?");
        }
        else {
            System.out.println("B");
        }

        if(a){
            System.out.println("A2");
        }
        else if(b){
            System.out.println("B2");
        }
        else if(c){
            System.out.println("C");
        }
        else {
            System.out.println("?");
        }

    }
}
