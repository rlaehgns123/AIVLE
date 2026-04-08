import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 아까운쿠폰 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int temp = 0;
        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        for(int i = 0; i < 8; i++){
            temp += N / arr[i];
            N %= arr[i];
        }
        System.out.println(temp);
    }
}
