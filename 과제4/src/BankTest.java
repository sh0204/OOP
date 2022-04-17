import java.util.Scanner;
public class BankTest {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		BankManager manager = BankManager.getInstance();
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");

			int choice = scanner.nextInt();
			switch (choice){
				case 1 :
					manager.join();
					break;
				case 2 :
					manager.query();
					break;
				case 3 :
					manager.deposit();
					break;
				case 4 :
					manager.withdraw();
					break;
				case 5:
					System.out.println("프로그램 종료");
					System.exit(0);
			}
		}
	}
}