import java.util.Scanner;
public class B_11021_AB7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] sum = new int[t];

        for(int i = 0; i < t; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            sum[i] = a+b;
        }

        for(int j = 0; j < sum.length; j++) {
            System.out.println("Case #" + (j+1) + ": " + sum[j]);
        }
    }
}
