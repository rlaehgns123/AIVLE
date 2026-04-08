import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//중요!!! 에라토스테네스의 체 이해하기.
public class 소수구하기 {
    static boolean[] prime;
    static int cnt = 0;
    static int isPrime(int N){
        prime = new boolean[N+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;    //소수 x : false, 소수 o : true

        for(int i = 2; i * i <= N; i++) {
            if(prime[i]){
                for(int j = i * i; j <= N; j += i){
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if(prime[i]) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(isPrime(N));
    }
}
