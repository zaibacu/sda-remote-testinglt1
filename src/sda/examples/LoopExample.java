package sda.examples;

public class LoopExample {
    public static void main(String[] args){
        int a = 0;
        while(a < 100){
            System.out.println(a);
            a++;
            if(a == 23)
                break;
        }
    }
}
