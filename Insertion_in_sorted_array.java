public class Insertion_in_sorted_array {
    public static void main(String[] args){
        int m=0;
        int arr[] = new int[20];
        for (int i = 0; i < 7; i++) {
            arr[i] = m;
            m+=2;   
        }
        int n = 7;
        int capacity = 20;
        int k = 11;
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
    static int Insert(int arr[],int n,int k,int capacity){
        int pos=0;
        if(n>=capacity){
            System.out.println("Array is full Insertion not possible");
        }
        else{
            for(int i=0;i<n;i++){
                if(arr[i]>k){
                    pos=i;
                    break;
                }
            }
            if(pos==0){
                arr[n]=k;
            }
            else{
                for(int j=n-1;j>=pos;j--){
                    arr[j+1]=arr[j];
                }
                arr[pos]=k;
            }
        }
        return n+1;
    }
}
