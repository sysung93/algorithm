import java.io.*;
import java.util.StringTokenizer;

public class B_1110_더하기사이클 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int cnt = 0;
        int copy = N;

        do{
            N = (((N % 10) * 10) + ((N / 10) + (N % 10)) % 10 );
            cnt++;
        } while(copy != N);

        System.out.println(cnt);
    }
}
