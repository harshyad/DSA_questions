import java.util.Scanner;

public class Fibnocci {
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter the length for the fibnocci series");
            int n=sc.nextInt();
            int a=0;
            int b=1;
            for(int i=1;i<=n;i++){
                if(i==1){
                    System.out.println(a);  
                }
                if(i==2){
                    System.out.println(b);
                }
                else{
                    int c=a+b;
                    System.out.println(c);
                    a=b;
                    b=c;
                }
            }
        }
    }   
}
