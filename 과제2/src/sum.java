import java.util.*;

public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int num=0;

        while(num !=-1){
            sum += num;
            System.out.print("정수 입력: ");
            num = sc.nextInt();
        }
        System.out.print("정수의 합: "+sum);
    }
}
