import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Add_EvenOdd {
    public static void main(String[] args) {
                                                       //done
        int oddsum = 0;
        int evensum = 0;
        int a[];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter any five numbers to find out Sum of Even and Odd number: ");
        a = new int[5];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        a[3] = sc.nextInt();
        a[4] = sc.nextInt();

        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evensum = evensum + a[i];
            } else {
                oddsum = oddsum + a[i];
            }
        }
        System.out.print(" Sum of Even numbers is : " +   evensum );
        System.out.print("\n Sum of Odd numbers is  : " +   oddsum);
    }
}
