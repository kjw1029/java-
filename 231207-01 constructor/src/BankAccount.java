// 은행계좌
// 잔고 : int

// 잔고를 0으로 초기화하는 기본생성자
// 잔고값을 파라미터로 전달받아 초기화하는 생성자

// 입금(int)
// 출금(int)

// 마이너스 계좌 X
public class BankAccount {
	int balance;

	public BankAccount() {
	}

	public BankAccount(int b) {
		if (b < 0) {
			balance = 0;
			System.out.println("마이너스 계좌를 만들 수 없어, 잔고는 0으로 설정하였습니다.");
		} else {
			balance = b;
		}
	}
	
	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		if (amount < 0) {
			return;
		}

		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("잔고가 부족해, 출금이 진행되지 않았습니다.");
		}
	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		System.out.println(acc.balance);

		BankAccount acc2 = new BankAccount(2000);
		System.out.println(acc2.balance);
		acc2.deposit(1000);
		System.out.println(acc2.balance);
		acc2.withdraw(-30000);
		System.out.println(acc2.balance);
	}

}
