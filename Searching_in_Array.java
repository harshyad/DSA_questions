public class Searching_in_Array {
    static int FindPosition(int arr[],int n,int k)
    {
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return(i+1);
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int k = 9;

        int position = FindPosition(arr,n,k);
        if (position==-1){
            System.out.println("Element not found");

        }
        else{
            System.out.println("Element Found at "+(position)+"th index");
        }
    }
}
