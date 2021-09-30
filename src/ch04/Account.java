package ch04;

public class Account {
    static int count;
    String accNo; //계좌번호
    int balance; //잔액

    public Account(String accNo) { //계좌 개설;
        this.accNo = accNo;
        this.balance = 0;
        Account.count++; //count도 가능 하지만, Account.count가 더 빠르고 가독성이 좋음
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        this.balance -= money;
    }
    public static void getAccountCnt(){
        System.out.println(Account.count);
    }
}
