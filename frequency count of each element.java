import java.util.*; 
class frequencycountofeachelement{
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
            frequencyCount(arr, n); // Time complexity O(n)

        }
        // Function to count the frequency of all elements from 1 to N in the array.
    }

    private static void frequencyCount(int[] arr, int N) {
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Addition of all the unique elements with their count into the hashMap
        for (int i = 0; i < N; i++) {
            if (map.containsKey(arr[i])) {
                counter = map.get(arr[i]);
                map.put(arr[i], counter + 1);
                counter = 0;
            } else {
                map.put(arr[i], 1);
            }
        }
        counter = 0;
        // Fetching the values of the hashmap 
        for (int j = 1; j <= N; j++) {
            if (map.containsKey(j)) {
                arr[counter] = map.get(j);
                counter++;
            } else {
                arr[counter] = 0;
                counter++;
            }
        }
    }

}