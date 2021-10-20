import java.util.Scanner;

public class B_10950_AB3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < T; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[i] = a+b;
        }

        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }


    }
}
