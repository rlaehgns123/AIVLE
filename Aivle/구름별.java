public class 구름별 {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++) {
            if(i > 0){
                System.out.print(" ".repeat(i));
            }
            System.out.println("**");
        }
    }
}