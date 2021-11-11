import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2577_숫자의개수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];

        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int num = arr[0] * arr[1] * arr[2];
        String snum = String.valueOf(num);
        int cnt = 0;

        int[] a = new int[10];

        for(int i = 0; i < snum.length(); i++){
            int number = snum.charAt(i) - '0';
            a[number]++;
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
