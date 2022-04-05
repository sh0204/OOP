public class Book {
    private int num;
    private String title;
    private int score;


    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title =title;
    }
    public int getNum(){
        return num;
    }
    public void setNum(int Num){
        this.num =num;
    }


    public void setScore(int score){
        this.score =score;
    }

    public Book(int num, String title, int score){
        this.num = num;
        this.title = title;
        this.score = score;
    }

    public void print() {
        System.out.println("번호: "+num);
        System.out.println("제목: "+title);
        System.out.println("평점: "+score);
    }
}
