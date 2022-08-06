import java.util.*;

public class Intersection_of_arrays {
    public static void main(String[] args) {
        int n,m;
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the size of the array:");
            n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the size of the array:");
            m = sc.nextInt();
            int arr2[] = new int[m];
            System.out.println("Enter the array:");
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            // Calling the hash function
            int op = NumberofElementsInIntersection(arr, arr2, n, m); // Time complexity O(n)
            System.out.println(op);

        }
    }
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            set.add(a[i]);
        }
        int count = 0;
        for(int j=0;j<m;j++){
            if(set.contains(b[j])){
                count++;
                set.remove(b[j]);
            }
        }
    return count;
    }
}
