import java.util.*;
public class sorted_array{
    public static void main(String[] args){
        System.out.println("Enter the size of the array");
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the array: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            // Call the function
            Find(arr,n);
        }

    }
    static int Find(int arr[],int n){
        for(int i=1;i<n;i++)
        {   if(arr[i-1]>arr[i]){
                System.out.println("Array is not sorted");
                return 0;
            }
            else{
                continue;
            }
        }
        System.out.println("Array is Sorted");
        return 0;
    }
}