package chap43.sync;

//출금 -> 악의적 사용
//동시에 같은 계좌에 출금
public class WithdrawTask implements Runnable {

    private BankAccount account;
    private int amount;

    public WithdrawTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
