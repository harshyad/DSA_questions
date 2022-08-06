import java.util.Scanner;

public class Majority {
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
        // Calling the hash function
        int p=majorityElement(arr, n); //Time complexity O(n)
        System.out.println(p);
     }
    }

    static int majorityElement(int a[], int size)
    {
        int m=0;
        for(int i=0;i<size;i++)
        {
            int z=0;
            for(int j=0;j<size;j++)
            {
                if((a[i]==a[j]) && (i!=j))
                {
                    z++;
                }
                if(z>=(size/2))
                {
                   m=a[j];
                   break;
                }
            }
            
        }
        if(m==0){
            return (-1);
        }
        else{
        return (m);
        }
        
    }
}


