package day35.bankAccount;

public class Test {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Josh Nash", 141141,1000);

        bankAccount1.deposit(200);
        bankAccount1.withdraw(300);
        bankAccount1.checkBalance();
        System.out.println(bankAccount1);
        //bankAccount1.withdraw(1000);
        bankAccount1.deposit(-1000);



    }
}
