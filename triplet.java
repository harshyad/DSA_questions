import java.util.HashSet;
import java.util.Scanner;

public class triplet {
        public static void main(String[] args){
            int n;
            System.out.println("Enter the size of the array:");
            try(Scanner sc=new Scanner(System.in);){
            n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the array:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("Enter the Number:");
            int m=sc.nextInt();

            // Calling the hash function
            Find_hash(arr, n, m); //Time complexity O(n)
    
         }
    }
    static boolean Find_hash(int arr[],int n,int sum)
    {
        HashSet<Integer> h1 = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            int temp=sum-arr[i];
            for(int j=0;j<n;j++)
            {
                int hello=0;
                hello = temp-arr[j];
                if(h1.contains(hello))
                {
                    System.out.println("The pair is:("+arr[j]+","+hello+","+arr[i]+")");
                    return true;
                }
               h1.add(arr[j]);  
            } 
        }
        System.out.println("No valid pair found");
        return false;
    }
}
