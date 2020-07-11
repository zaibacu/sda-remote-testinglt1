package sda.loop_operators;

public class BreakAndContinue {
    public static void main(String[] args){
        int i = 0;
        while(true){
            System.out.println(i);
            if(i == 55){
                break;
            }
            i++;
        }

        for(i = -10; i<10; i++){
            if(i == 0)
                continue;

            System.out.println(5.0 / i);
        }

        for(int j = 0; j<10; j++){
            for(int k = 0; k<10; k++){
                if(k == 5){
                    break;
                }

                System.out.println(k);
            }
        }
    }
}
