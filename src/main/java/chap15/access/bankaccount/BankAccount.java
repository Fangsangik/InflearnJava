package chap15.access.bankaccount;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount){
        if (isAmountValid(amount)){
            balance += amount;
        } else {
            System.out.println("유요하지 않은 금액 입니다");
        }
    }

    public void withdraw(int amount){
        if (isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액 입니다.");
        }
    }

    public int getBalance(){
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
