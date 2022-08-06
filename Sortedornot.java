import java.util.*;
public class Sortedornot {
    public static boolean sorted_Or_Not(int arr[],int n){
        int m=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                m++;
            }
        }
        m++;
        if(m==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of the array");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter the elements of the array");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            if(sorted_Or_Not(arr, size)){
                System.out.println("Array is sorted");
            }
            else{
                System.out.println("Array is not sorted");
            }
        }
    }
}
