import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        if (a < b) {
            a = b;
            b = temp;
        }
        while(true){
            temp = a;
            a = b;
            b = temp % b;
            if(a % b == 0)
                break;
        }
        System.out.println(b);
    }
}
