import java.util.Scanner;
public class BankManager {
    public static int cnt = 0;
    private static BankManager instance = new BankManager();
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static BankManager getInstance() {
        return instance;
    }
    //계좌생성하기
    static void join() {
        System.out.println("------");
        System.out.println("계좌생성");
        System.out.println("------");

        System.out.print("계좌변호: ");
        String ano = scanner.next();

        System.out.print("계좌주: ");
        String owner = scanner.next();

        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();

        accountArray[cnt] = new Account(ano, owner, balance);
        cnt++;
        System.out.println("계좌가 생성되었습니다.");

    }
    //계좌확인하기
    private static Account login(String ano) {
        for (int i = 0 ; i < cnt; i++) {
            if (accountArray[i].getAno().equals(ano)) {
                return accountArray[i];
            }
        }
        System.out.println("해당 계좌번호를 찾을 수 없습니다.");
        return null;
    }
    //계좌목록보기
    static void query() {
        System.out.println("------");
        System.out.println("계좌목록");
        System.out.println("------");

        for(int i=0; i<cnt; i++) {
            System.out.println(accountArray[i].getAno() + "     " +
                    accountArray[i].getOwner() + "     " + accountArray[i].getBalance());
        }
    }
    //예금하기
    static void deposit() {
        System.out.println("------");
        System.out.println("예   금");
        System.out.println("------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        //int balance = scanner.nextInt();
        login(ano).setBalance(login(ano).getBalance() + scanner.nextInt());
        System.out.println("예금이 성공되었습니다.");
    }

    //출금하기
    static void withdraw() {
        System.out.println("------");
        System.out.println("출   금");
        System.out.println("------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        //int balance = scanner.nextInt();

        int remain = login(ano).getBalance() - scanner.nextInt();
        if (remain < 0) {
            System.out.println("결과 : 출금 가능액을 초과하였습니다.");
        } else {
            login(ano).setBalance(remain);
            System.out.println("결과 : 출금이 성공되었습니다.");
        }
    }
}
