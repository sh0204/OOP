import java.util.Scanner;

public class BookTest {
    static final int ENROLL = 1;
    static final int SEARCH = 2;
    static final int PRINT = 3;
    static final int EXIT = 4;

    public static void main(String[] args) {

        BookManager manager = BookManager.getInstance();
        Scanner sc = new Scanner(System.in);
        int input;
        do
        {
            manager.showMenu();
            input = manager.readInput();
            switch(input) {
                case ENROLL:
                    manager.enroll();
                    break;
                case SEARCH:
                    manager.search();
                    break;
                case PRINT:
                    manager.print();
                    break;
                case EXIT:
                    return;
            }
        }while(true);
    }
}