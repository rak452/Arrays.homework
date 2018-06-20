//import java.util.Scanner;
//import java.util.ArrayList;
//public class Count_Words_Spaces {
//    public static void main(String[] args) {
//        int i;
//        int countWords=0;
//        int countSpaces=0;
//        String n;
//        int num;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Please Enter string length :");
//        num = sc.nextInt();
//        System.out.println(" Please Enter String you want to calculate how many a in string :");
//        n = sc.nextLine();
//        for (i = 0; i<num; i++) {
//            if(n.toString()!=" ")
//            {
//                countWords = countWords + 1;
//            }
//            if (n.charAt(i) == 32)
//            {
//                countSpaces=countSpaces+1;
//
//            }
//        }
//        System.out.println(" Total number of a are :"+ countWords   + countSpaces);
//
//    }
//}