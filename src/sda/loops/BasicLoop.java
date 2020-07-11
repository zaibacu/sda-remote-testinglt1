package sda.loops;

public class BasicLoop {
    public static void main(String[] args){
        int sum = 0;
        int i = 0;
        // i - mūsų skaitliukas
        // 1 + 2 + 3 ... + 10
        while(i < 20){
            sum += (i + 1);
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;

        // garanatuotai bent vieną kartą
        do{
            sum += (i + 1);
            i++;
        }while(i < 20);

        System.out.println(sum);

        //
        sum = 0;

        // for(<skaitliuko sukurimas> ; <sąlyga> ; <ką veikt su skaitliuku>)
        for(int j = 0; j<20; j++){
            sum += (j + 1);
        }

        System.out.println(sum);

        // foreach
        String[] fruits = {"apple", "pear", "apple", "orange", "coconut"};
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // while (do while)
        // for
        // foreach - jokios logikos nėra
    }
}
