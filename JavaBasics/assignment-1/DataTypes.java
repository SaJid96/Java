import java.util.*;

public class DataTypes {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        /*
         *         TODO:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers

         */
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // int average=(a+b+c)/3;
        // System.out.println(average);


        /*
         * TODO: In a program, input the side of a square. You have to output the area of the
square
         */
       
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int area=a*a;
        //         System.out.println(area);



        /*
         * TODO:  Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
         */

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();

        float eraser = sc.nextFloat();

        float bill=pencil + pen +eraser;
        System.out.println("the total billl is = "+ bill);

        float gst=bill+(0.18f * bill);

        System.out.println("the GST  is = "+ gst);
    }}
        

