import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Insert_Element {
    public static void main(String[] args) {
                                                               // not done
        int a[];
        int pos;
        int i;
        int n;
        int newvalue;

        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter number of values you want in array: " );
        n=sc.nextInt();

        a=new int[n+1];
        System.out.println(" Enter values: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(" Enter position where you want to insert value: ");
        pos=sc.nextInt();
        System.out.println(" Enter value you want to insert: ");
        newvalue = sc.nextInt();
        for(i=(n-1);i>=(pos-1);i--)
        {
            a[i+1]=a[i];
        }
a[pos-1]=newvalue;
        System.out.println(" New Array after inserting new value: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+",");
        }

    }
}
