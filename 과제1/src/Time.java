import java.util.Scanner;
public class Time {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("초 입력: ");
        int time = scanner.nextInt();
        int sec = (time%60);
        int min = (time/60);

        System.out.println(time + "초는 "+min +"분 "+sec + "초입니다.");
    }
}
