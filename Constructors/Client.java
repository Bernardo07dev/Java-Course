package Constructors;

public class Client{
    private int accountNumber;
    private String userName;
    private boolean initialDep;
    private double statement;

    public Client(int accountNumber, String userName, boolean initialDep, double statement){
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.initialDep = initialDep;
        this.statement = statement;
    }

    public void getClient(){
        System.out.printf("Account Data %n - Account: %d %n - Holder: %S %n - Balance: %.2f%n %n ", this.accountNumber, this.userName, this.statement);
    }

    public void makeDeposit(double Deposit){
        if (initialDep){
            System.out.println("ESSE É SEU PRIMEIRO DEPÓSITO");
        }

        statement += Deposit;

        System.out.printf("Updated Account %n - Account: %d %n - Holder: %S %n - Balance: %.2f", this.accountNumber, this.userName, this.statement);
    }
}