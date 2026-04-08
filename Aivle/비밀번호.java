import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 비밀번호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        for (int i = 0; i < n; i++) {
            String s = st.nextToken();
            if (s.equals("c")) {
                System.out.print("c");
                break;
            }
            System.out.print(s+" ");
        }
    }
}

