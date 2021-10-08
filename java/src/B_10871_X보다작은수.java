//import java.util.Scanner;
//
//public class B_10871_X보다작은수 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int X = sc.nextInt();
//        int[] nArray = new int[N];
//
//        for(int i = 0; i < nArray.length; i++){
//            int num = sc.nextInt();
//            if (X > num){
//                System.out.println(num);
//            }
//        }
//    }
//}



import java.util.Scanner;

public class B_10871_X보다작은수 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] nArray = new int[N];

        for(int i = 0; i < N; i++){
            nArray[i] = sc.nextInt();
        }

        for(int i = 0; i <N; i++){
            int num = nArray[i];

            if( X > num){
                System.out.print(num+" ");
            }
        }
    }
}
