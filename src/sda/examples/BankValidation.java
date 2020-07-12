package sda.examples;

public class BankValidation {
    public static void main(String[] args){
        String iban = "LT121000011101001000";
        if(iban.length() != 20){
            System.out.println("Incorrect IBAN");
            System.exit(0);
        }

        if(!iban.startsWith("LT")){
            System.out.println("Incorrect IBAN");
            System.exit(0);
        }

        String bban = iban.substring(4);
        int bankId = Integer.parseInt(bban.substring(0, 5));
        String accountNumber = bban.substring(5);

        System.out.println("IBAN is correct");
    }
}
