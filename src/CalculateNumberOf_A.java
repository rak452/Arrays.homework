import java.util.Scanner;
import java.util.Scanner;

public class CalculateNumberOf_A {

    public static void main(String[] args) {

        int i;
        int count=0;
        String n;
        String a;
                                                                   //done;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter string length :");
        a=sc.nextLine();
        System.out.println(" Please Enter String you want to calculate how many a in string :");
        n= sc.nextLine();
        for(i=0;i<n.length();i++)
        {
            if(n.charAt(i)==97)
            {
                count=count+1;
            }
        }
        System.out.println(" Total number of a are :"  + count);

    }
}
