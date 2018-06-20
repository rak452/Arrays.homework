import java.util.ArrayList;
import java.util.Scanner;
public class duplicate_number {
    public static void main(String[] args) {
        int a[];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array: ");  //done
        a= new int[5];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        a[3]=sc.nextInt();
        a[4]=sc.nextInt();
        for(i=0;i<a.length-1;i++)
             if(a[i]==a[i+1])
                {
                    System.out.println(" Duplecate values is : " +  a[i]);
                }

    }
}

