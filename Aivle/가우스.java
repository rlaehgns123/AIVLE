import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가우스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long k = Long.parseLong(br.readLine());
        long[] arr = {3, 5, 17, 257, 65537};

        while (k%2 == 0) k /= 2;

        for(long p : arr) {
            if (k % p == 0){
                k /= p;
                if(k % p == 0){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(k == 1 ? "YES" : "NO");
    }
}
