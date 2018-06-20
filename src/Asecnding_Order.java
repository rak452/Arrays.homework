import java.util.Scanner;
import java.util.ArrayList;
public class Asecnding_Order {
    public static void main(String[] args) {
        int a[];
        int n;
        int i;
        int j;                                   //done
        int temp;
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter how many Elements you want in Array:  ");
        n =sc.nextInt();
        System.out.println(" Please Enter Elements of Array: ");
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(" Array is values are sorted ascending order: ");
        for(i=0;i<n;i++)
        {
            for (j = i+1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
for(i=0;i<n;i++)
{
    System.out.println(a[i]);
}
    }

}
