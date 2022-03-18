import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans, cnt=0;
        int guess;
        ans = (int) (Math.random()*100);
        do {
            System.out.print("정답을 추측하여 보시오: ");
            guess = sc.nextInt();
            if(guess<ans) {
                System.out.print("LOW\n");
                cnt++;
            }
            if(guess>ans){
                System.out.print("HIGH\n");
                cnt++;
            }
        }while(guess !=ans);
        System.out.printf("축하합니다. 시도횟수=%d", cnt);
    }

}