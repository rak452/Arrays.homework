import java.util.ArrayList;
public class Equals_arrays {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 4, 5};
        int i;
        int j;
        for (i = 0; i < a.length; i++) {                 //done
            for (j = 0; j < b.length; j++) {
                if (a[i] == b[i]) {
                    break;
                } else
                    {
                    System.out.println("Array are not Equal: ");
                    break;
                }
            }

        }
        System.out.println(" Array are Equal: ");
    }
}