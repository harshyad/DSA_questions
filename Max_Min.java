import java.util.Scanner;

public class Max_Min {
    public static void findMinMax(int arr[],int n){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max value is :" + max);
        System.out.println("Min value is :" + min);
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the size of the array");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter the elements of the array");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            findMinMax(arr, size);
        }
    }    
}
