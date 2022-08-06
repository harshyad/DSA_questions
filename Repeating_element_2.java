import java.util.Scanner;

public class Repeating_element_2 {
    public static void main(String[] args){
        int n;
        System.out.println("Enter the size of the array");
        try (Scanner sc = new Scanner(System.in)) 
        {
            n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the array:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int m = Find(arr,n);
            System.out.println("The repeating element is:"+m);
        }
    }
    static int Find(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=arr[i]+sum;
        }
        // Sum of first (n-1) natural numbers is : ((n-1)*n)/2
        int sumofnumbers=((n-1)*n)/2;
        return (sum-sumofnumbers);

    }
}
