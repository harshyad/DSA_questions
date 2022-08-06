public class Deleting_values {
        public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int d = 8;
        // Before Deletion
        System.out.println("Before Deletion: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        // Calling the Delete function
        n=Delete(arr, n, d);

        // After Deletion
        System.out.println("\nAfter Deletion: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static int Delete(int arr[],int n,int d){
        int pos=0;
        for(int i=0;i<n;i++){
            if(arr[i]==d){
                pos = i;
            }
        }
        // System.out.print(pos);
        for(int j=pos;j<n-1;j++){
            arr[j]=arr[j+1];
        }

        return n-1;
    }
}
