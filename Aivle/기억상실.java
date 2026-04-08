import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 기억상실 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());
        long day;
        if (N <= A) {
            day = 1;
        } else {
            day = (N - A) / (A - B);
            if ((N - A) % (A - B) != 0) {
                day++;}
            day++;}
        System.out.println(day);
    }
}
