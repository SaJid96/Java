import java.util.*;

public class ArthematicOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 10;
        int b = 5;

        switch (n) {
            case 1:
                System.out.println("Add = " + (a + b));

                break;

            case 2:
                System.out.println("sub = " + (a - b));

                break;
            case 3:
                System.out.println("mul = " + (a * b));

                break;
            case 4:
                System.out.println("div =" + (a / b));

                break;
            case 5:
                System.out.println("rem =" + (a % b));

                break;
            default:
                System.out.println("please try again ");
                break;
        }
    }
}
