public class Inserting_values {
    static int Insert(int arr[],int n,int k,int capacity)
    {
        if(n>=capacity){
            return n;
        }
        arr[n]=k;
        n++;
        return n;
    }
    public static void main(String[] args)
    {
        int m=0;
        int arr[] = new int[20];
        for (int i = 0; i < 7; i++) {
            arr[i] = m;
            m++;   
        }
        int n = 7;
        int capacity = 20;
        int k = 10;
        // Before insertion
        System.out.print("Before insertion: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        n = Insert(arr, n, k, capacity);

        // After insertion
        System.out.print("\n After insertion: ");
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
        
    }
}
