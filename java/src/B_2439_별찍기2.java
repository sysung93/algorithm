import java.util.Scanner;

public class B_2439_별찍기2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int a = 0; a < n-i-1; a++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
