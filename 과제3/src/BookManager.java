import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookManager {

    private static BookManager instance = new BookManager();
    private ArrayList<Book> booklist ;
    private BookManager(){
        booklist = new ArrayList<Book>();
    }
    public static BookManager getInstance() {
        return instance;
    }
    public void showMenu(){
        System.out.println("================================");
        System.out.println("1.책 등록\n2.책 검색\n3.모든 책 출력\n4.종료");
        System.out.println("================================");
        System.out.println("번호를 입력하시오: ");
    }
    Scanner sc = new Scanner(System.in);

    public int readInput(){
        int input = sc.nextInt();
        return input;
    }
    public void enroll(){
        System.out.println("도서번호: ");
        int num = sc.nextInt();
        System.out.println("제목: ");
        String title = sc.next();
        System.out.println("평점: ");
        int score = sc.nextInt();
        Book book = new Book(num,title,score);
        booklist.add(book);
    }
    public void search() {
        System.out.println("찾고 싶은 책 도서 번호 입력: ");
        int bookNum1 = sc.nextInt();
        for(int i =0; i<booklist.size(); i++){
            Book b1 = booklist.get(i);
            int num1 = b1.getNum();
            if(bookNum1 == num1){
                b1.print();;
            }
        }
    }
    public void print() {
        Iterator<Book> it = booklist.iterator();
        while (it.hasNext()){
            Book result = it.next();
            result.print();
            System.out.println();
        }
    }
}