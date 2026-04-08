import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 림보게임 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(st.nextToken());
            if(h <= 160){
                System.out.println("I" + " " +h);
                return;
            }
        }
        System.out.println("P");
    }
}
