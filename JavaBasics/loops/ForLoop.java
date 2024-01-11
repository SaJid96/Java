import java.util.*;

public class ForLoop {
    
    public static void main(String[] args) {
        // for(int i=0;i<10;i++){
        //     System.out.println("Hello world");
        // }

        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.println("");
            
        // }

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // for(int i=0;i<n;i++){
        //     if (i==3) {
                
        //         continue;
                
        //     }
        //     System.out.print(i);
            
        // }
        boolean isPrime=true;
        if (n ==2) {
            System.out.println(n+" is not prime number");

        }
        else{

        for (int i = 2; i <Math.sqrt(n); i++) {

            if(n%i == 0){
                isPrime=false;
            }
            
        }
        if (isPrime == true) {
            System.out.println(n +" is prime number");
            
        }else{
             System.out.println(n +" is not prime number");
        }

        }

    }
}
