import java.util.Scanner;

public class Countofnumbers {
    public static void main(String args[]){
        int p=0;
        int n=0;
        int o=0;
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the limit till where you want to enter the number:");
           int l=sc.nextInt();
           System.out.println("Enter the numbers:");
           for(int i=1;i<=l;i++){
            int m=sc.nextInt();
            if(m>0){
                p++;
            }
            else if(m<0){
                n++;
            }
            else{
                o++;
            }
           }
    }
       System.out.println("Number of positive number: "+p);
       System.out.println("Number of negative number: "+n);
       System.out.println("Number of zero's:"+o);


    }   
}
