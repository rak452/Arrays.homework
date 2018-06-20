import java.util.Scanner;
import java.util.ArrayList;

public class Reverse_Number {
    public static void main(String[] args) {


        int num;
        int reverse=0;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please Enter the number you want reverse: ");
        num=sc.nextInt();
        while (num!=0)
        {
            reverse= reverse *10;
            reverse= reverse+num%10;
            num=num/10;

        }
        System.out.println(" Reverse number is: "  + reverse);

    }
}
