import java.util.Scanner;
import java.util.Scanner;
public class Sum_First_Last {

    public static void main(String[] args) {

        int n[];
        int sum = 0;                               // Done
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter any five numbers to find out sum of first and last number : ");
        n = new int[5];
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();
        n[3] = sc.nextInt();
        n[4] = sc.nextInt();
        sum = n[i] + n[n.length - 1];
        System.out.println(" Sum of five number is :   " + sum);
    }
}
