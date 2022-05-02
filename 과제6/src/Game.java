import java.util.Scanner;

public class Game {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String[][] play = new String[10][17];

        for(int i=0;i<10;i++) {
            for(int j=0;j<17;j++) {
                play[i][j] = " ";
            }
        }
        play[7][2] = "G"; //황금
        Main me = new Main();
        play[me.y][me.x] = "@"; //주인공
        Monster mon = new Monster();
        play[mon.y][mon.x] = "M"; //몬스터

        while(true) {
            System.out.println("###################");
            for(int i=0; i<10; i++) {
                System.out.print("#");
                for(int j=0; j<17; j++) {
                    System.out.print(play[i][j]);
                }
                System.out.println("#");
            }
            System.out.println("###################");
            System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l): ");
            
            char ch = scan.next().charAt(0);
            play[me.y][me.x] = " ";
            me.move(ch);
            play[mon.y][mon.x] = " ";
            int my= mon.y, mx = mon.x;
            mon.move(ch);

            if(mon.y<10 && mon.x<17) {
                play[me.y][me.x] = "@";
                play[mon.y][mon.x] = "M";
            }else {
                play[me.y][me.x] = "@";
                play[my][mx] = "M";
            }
            //황금 만나면
            if(me.y == 7 && me.x ==2) {
                System.out.println("황금 획득");
                break;
            }
            //몬스터 만나면
            if(me.y == mon.y && me.x == mon.x) {
                System.out.println("잡힘");
                break;
            }
        }
    }
}