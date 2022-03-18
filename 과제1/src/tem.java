import java.util.*;

public class tem {
    public static void
    main(String[] args) {

        System.out.println("===========================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("===========================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("번호를 선택하세요: ");
        int choice = scanner.nextInt();

        System.out.print("온도를 입력하시오: ");
        double temp = scanner.nextDouble();
        double f = temp * 1.8+32;
        double c = (temp -32)*5.0/9.0;

        String result= (choice == 1 ? "섭씨온도: "+c : "화씨온도: "+f);
        System.out.println(result);

    }
}