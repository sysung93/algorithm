import java.io.*;
import java.util.StringTokenizer;

public class B_10818_최소최대 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arr = new int[N];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++ ) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];

            /*min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);*/
        }
        System.out.println(min + " " + max);

    }
}
