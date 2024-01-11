import java.util.*;

public class IfElse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
    
        // String checkEvenOdd=(n%2 == 0) ? "even" :  "odd";
        // System.out.println(checkEvenOdd);

        // String Voting=(n>=18) ? "Adult" : (n>=13 && n<18 ? "tennager" :"under age");
        // System.out.println("Voter is = "+ Voting);

        // int tax;
        // int calculate=(n <500000) ? 0 : ((n >= 500000 && n< 1000000) ? (int) (n*0.2) : (int) (n*0.3));
        // System.out.println("your tax = "+calculate);

        
        //  String type=(n%2 == 0) ? "even" : "odd";
        //  System.out.println(type); 
        String result=(n >= 33) ? "Pass" : "fail";
        System.out.println(result);
        
    }
}

