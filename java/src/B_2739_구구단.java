import java.util.Scanner;

public class B_2739_구구단 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m;

        for(m = 1;m <= 9;m++) {
            System.out.println(n + " * " + m + " = " + (n*m));
        }


    }
}
