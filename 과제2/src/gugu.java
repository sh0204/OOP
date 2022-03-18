public class gugu {
    public static void main(String[] args){
        for(int i=1;i<=9; i++){
            for(int j=2;j<=5; j++) {
                System.out.print(j + " * " + i + " = " +
                        String.format("%2d", i * j)+"\t");
            }
            System.out.println();
        }
    }
}
