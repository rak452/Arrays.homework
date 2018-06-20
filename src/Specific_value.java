import java.util.Scanner;
import java.util.Scanner;
public class Specific_value {
    public static void main(String[] args) {

        int a[]={10,20,30};
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter the value you want to know position about: ");
        int n =sc.nextInt();
        for(i=0;i<a.length;i++)          //done
        {
            if (n!= a[i]) {
                continue;

            }
            else
            {
                System.out.println("Number found at position : " +  i);
            }
        }
    }
}
