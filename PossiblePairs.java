import java.util.Scanner;

public class PossiblePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}
INPUT
4
5 7 9 0
OUTPUT
5 7
5 9
5 0
7 9
7 0
9 0
