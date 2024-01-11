import java.util.*;

public class UnaryOperators {
    public static void main(String[] args) {

        /*
         * Pre-increment
         * 
         */
        // TODO:first value changes,then the value is assigned.
        int a = 10;
        int b = ++a;
        System.err.println("a= " + a);
        System.err.println("b= " + b);
        System.err.println("eod pre-incre");
        /*
         * Post-increment
         * 
         */
        // TODO:first value assigned,then the value is changed
        int c = 10;
        int d = c++;
        System.err.println("c= " + c);
        System.err.println("d= " + d);
        System.err.println("eod post-incre");

        /*
         * Post-increment
         * 
         */
        // TODO:first value changed,then the value is assigned
        int e = 10;
        int f = --e;
        System.err.println("e= " + e);
        System.err.println("f= " + f);
        System.err.println("eod pre-decre");

        /*
         * Post-decrement
         * 
         */
        // TODO:first value assigned,then the value is changed
        int g = 10;
        int h = g--;
        System.err.println("g= " + g);
        System.err.println("h= " + h);
        System.err.println("eod post-decre");

    }

}
