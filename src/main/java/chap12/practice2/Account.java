package chap12.practice2;

public class Account {
    public int balance;


    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        System.out.println("잔액부족");
    }

    public void printBalance(){
        System.out.println(balance);
    }
}
