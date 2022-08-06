import java.util.HashSet;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of the array:");
        try (Scanner sc = new Scanner(System.in);) {
            n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the Number:");
            int m = sc.nextInt();
            // Calling the function
            // Find(arr,n,m); //Time complexity O(n^2)
            //
            // Calling the hash function
            Find_hash(arr, n, m); // Time complexity O(n)

        }
    }

    static int Find(int arr[], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((arr[i] + arr[j]) == m) && (i != j)) {
                    System.out.println("The pair is:" + arr[i] + " " + arr[j]);
                    return 0;
                }
            }
        }
        System.out.println("No valid pair found");
        return 0;

    }

    static int Find_hash(int arr[], int n, int sum) {
        HashSet<Integer> h1 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int temp = sum - arr[i];
            if (h1.contains(temp)) {
                System.out.println("The pair is:(" + arr[i] + "," + temp + ")");
                return 0;
            }
            h1.add(arr[i]);
        }
        System.out.println("No valid pair found");
        return 0;
    }
}
