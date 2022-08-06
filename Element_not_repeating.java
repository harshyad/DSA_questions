public class Element_not_repeating {
    public static void main(String[] args) {
        int arr[] = { 3, 3, 5, 4, 5, 7, 4 };
        int n = arr.length;
        int a = 0;
        int z = 0;
        for (int i = 0; i < n; i++) {
            if (arr[a] == arr[i]) {
                z++;
            }
            if (i == n - 1) {
                if (z == 1) {
                    System.out.println(arr[a]);
                    break;
                } else {
                    i = 0;
                    a++;
                    z = 0;
                }
            }
        }
    }

}
