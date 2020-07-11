package sda.loops;

public class Greetings {
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


    }
}
