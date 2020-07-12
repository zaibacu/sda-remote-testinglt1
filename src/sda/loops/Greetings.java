package sda.loops;

public class Greetings {
    public static void printGreetings(String[] greetings){
        String head = greetings[0];
        String[] tail = new String[greetings.length - 1];
        // [ 1 2 3 4 5 ]
        // head - 1, tail [ 2 3 4 5 ]

        // greetings = [ 1 2 3 4 5 ]
        // tail =      [   2 3 4 5 ]
        for(int i = 0; i<tail.length; i++){
            tail[i] = greetings[i+1];
        }

        System.out.println(head);
        if(tail.length > 0){
            printGreetings(tail);
        }
    }

    public static void main(String[] args){
        String[] greetings = {"Hola", "Labas", "Hello"};

        // Foreach
        for(String greeting : greetings){
            System.out.println(greeting);
        }

        int l = greetings.length;

        // For
        for(int i = 0; i<l; i++){
            System.out.println(greetings[i]);
        }

        // While
        int j = 0;
        while(j < greetings.length){
            System.out.println(greetings[j]);
            j++;
        }

        // Recursion
        printGreetings(greetings);
    }
}
