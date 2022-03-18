import java.util.Scanner;

public class diafull {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("MAX(홀수): ");
        int num = sc.nextInt();

        for(int i=0; i<num;i++){
            for(int j=0; j<num;j++){
                if(i <=num/2) //다이아 위쪽
                {
                    if(i+j<=num/2-1) //왼쪽 위 공백
                        System.out.print(" ");
                    else if(j-i>= num/2+1) //오른쪽 위 공백
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                else if(i>num/2) //다이아아래 역삼각형
                {
                    if (i-j>=num/2+1) //왼쪽 밑 공백
                        System.out.print(" ");
                    else if (i+j>=num/2*3+1)//오른쪽 밑 공백
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
