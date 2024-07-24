package basic.questResolve;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금액: "+ amount+", 잔고: "+ balance);
    }
    void withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
        System.out.println("출금액: "+ amount+", 잔고: "+ balance);
        } else {
            System.out.println("잔액 부족");
            System.out.println("잔고: "+ balance);
        }

    }
}
