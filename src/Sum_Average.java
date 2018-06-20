import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Average {

    public static void main(String[] args)
    {
        int n[];
     float sum=0;                               // Done
     float Average;
     int i;
     Scanner sc= new Scanner(System.in);
     System.out.println(" Please Enter any five numbers you want to add and want to find out average : ");
     n=new int[5];
     n[0]=sc.nextInt();
     n[1]=sc.nextInt();
     n[2]=sc.nextInt();
     n[3]=sc.nextInt();
     n[4]=sc.nextInt();
     for(i=0;i<n.length;i++)
     {
         sum = sum + n[i];

     }
     Average = sum/5;
     System.out.println(" Sum of five number is :   " +  sum );
     System.out.println(" Average of five number : "  + Average);
    }
}
