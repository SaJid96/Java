import java.util.*;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter the number ");
            int n = sc.nextInt();
            if(n%10 ==0){
                System.out.println("that's it");
                continue;
            }
            System.out.println(n);

        } while (true);
    }
}
