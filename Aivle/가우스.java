import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가우스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long k = Long.parseLong(br.readLine());

        long[] arr = {3, 5, 17, 257, 65537};

        while(k % 2 == 0){
            k /= 2;
        }
        for (long p : arr){
            if(k / p == 0){
                k /= p;
                if(k % p == 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(k == 1 ? "YES" : "NO");

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int k = Integer.parseInt(br.readLine());
//        String yesorno = "NO";
//        List<Integer> list = List.of(3, 5, 17, 257, 65537);
//        for (int i = 0; i < 5; i++){
//            if(list.contains(list.get(i))|| list.contains(k / list.get(i)) && k % list.get(i) == 0){
//                yesorno = "YES";
//                break;}}
//        System.out.println(yesorno);
    }
}
