package starter.questResolve;

public class MethodEx3Resolve {
    // 메서드 리펙토링 하기
    // 다음은 입금, 출금을 나타내는 코드이다.
    // 입금(deposit)과, 출금(withdraw)을 메서드로 만들어서 리펙토링 해보자
    public static void main(String[] args) {
        int balance = 10000;
        // 입금 1000
        int depositAmount = 1000;
        deposit(balance, depositAmount);

        // 출금 2000
        int withdrawAmount = 2000;
        withdraw(balance, withdrawAmount);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static void deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: "+balance);
    }
    public static void withdraw(int balance, int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: "+balance);
        }else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
    }
}
