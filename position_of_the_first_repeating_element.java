import java.util.*;
public class position_of_the_first_repeating_element {
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
            // Calling the hash function
            int op = firstRepeated(arr, n); // Time complexity O(n)
            System.out.println(op);

        }
    }
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        // My logic
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int count = 0;
        // int max_repeat = n+1;
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(arr[i])){
        //         count = map.get(arr[i]);
        //         map.put(arr[i],count+1);
        //         count=0;
        //     }
        //     else{
        //         map.put(arr[i],1);
        //     }
        // }
        // count=0;
        // for(int j=0;j<n;j++){
        //     if(map.containsKey(arr[j])){
        //         count = map.get(arr[j]);
        //         if(count>1 && j<max_repeat){
        //             max_repeat = j+1;
        //         }
        //     }
        // }
        // if(max_repeat==n+1){
        //     return -1;
        // }
        // else{
        //     return max_repeat;
        // }
        // Someone else logic
        HashSet<Integer> set = new HashSet<>();
        int res=-1;
        for(int i=n-1;i>=0;i--){
            if(set.contains(arr[i])){
                res=i+1;
            }
            set.add(arr[i]);
        }
        return res;
    }
}
