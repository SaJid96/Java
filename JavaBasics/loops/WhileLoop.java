import java.util.*;

public class WhileLoop{
    public static void main(String[] args) {
        // int counter=0;
        // while (counter <=10) {
        //     System.out.println("Hello world");
        //     counter++;
        // }

        // int i=1;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }

//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//             int i=1;

//             while (i<=n) {
//                 System.out.println(i);
//                 i++;
//             }
// System.out.println("eod code");



        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();

    int n=10899;

    while (n>0) {
        int lastDigit=n%10;
        System.out.print(lastDigit + " ");
        n/=10;
        
    }

System.out.println();
    }
}