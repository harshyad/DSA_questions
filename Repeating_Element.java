import java.util.Scanner;

public class Repeating_Element {
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
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if((arr[i]==arr[j]) && (j!=i)){
                return(arr[i]);
               }
            }
        }
        return 0;
    }
}
