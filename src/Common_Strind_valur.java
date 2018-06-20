import java.util.ArrayList;
public class Common_Strind_valur {
    public static void main(String[] args) {
        String a[]={"ab","bc","bb","cc"};
        String b[]={"bb", "aa", "bb","cc"};
        String c[];
        int i;
        int j;
        c = new String[4];
        System.out.println("Common strings from both arrays are: ");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<b.length;j++)
            {
                if(a[i]==b[i])
                {
                    c[i]=a[i];
                    System.out.println(c[i]);
                    break;
                }

            }
        }

    }

}
