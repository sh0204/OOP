import java.util.Scanner;

public class Add {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x,y,sum;

        System.out.println("첫번째 숫자: ");
        x = scanner.nextInt();
        System.out.println("두번째 숫자: ");
        y = scanner.nextInt();

        sum = x+y;
        System.out.println("합: " +sum);

    }
}
