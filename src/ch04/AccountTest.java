package ch04;

public class AccountTest {

    static{ //static 블럭
        System.out.println("hello");
        System.out.println("good");
    } //프로그램 시작전 전처리 작업 할 때

    public static void main(String[] args) {
        Account acc1 = new Account(("001"));
        Account acc2 = new Account(("002"));
        Account acc3 = new Account(("003"));
        System.out.println("개설된 계좌 수 : "+Account.count);
        acc1.deposit(10000);
        acc1.withdraw(2000);
        System.out.println(acc1.balance);
        Account.getAccountCnt();

        int result = Calc.add(10,20);
        System.out.println(result);
    }
}
