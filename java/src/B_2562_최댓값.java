import java.io.*;

public class B_2562_최댓값 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int N = 0;
        int cnt = 0;

        for(int value : arr) {
            cnt++;
            if(value > max) {
                max = value;
                N = cnt;
            }
        }
        System.out.println(max);
        System.out.println(N);
    }
}