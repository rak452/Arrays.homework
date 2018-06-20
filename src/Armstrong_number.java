import java.util.Scanner;
public class Armstrong_number {
    public static void main(String[] args) {


        int num;
        int result = 0;
        int remainder;
        int temp;
        int newresult;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter the number you want to find out is Armstrong or not: ");
        num = sc.nextInt();
       temp = num;
        while (num!=0)
        {
            remainder = num%10;
            num = num / 10;
            result= result+(remainder*remainder*remainder);
            }
            if (result==temp)
            System.out.println(" Number is Armstrong Number ");
            else
            System.out.println(" Number is not Armstrong ");

    }
}