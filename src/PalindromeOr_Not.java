import java.util.Scanner;
public class PalindromeOr_Not {
    public static void main(String[] args) {
        int num;
        int reverse=0;
        int newnumber;
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please Enter the number you want reverse: ");
        num=sc.nextInt();
        temp=num;
        while (num!=0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num= num/10;
        }
            System.out.println(" Reverse number is: "  + reverse);
            newnumber = reverse;
            if (temp==newnumber) {
                System.out.println(" Reverse number is Palindrome ");
            } else {
                System.out.println(" Reverse number is not Palindrome: ");
            }

    }
    }


