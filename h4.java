import java.util.*;
import java.util.ArrayList;
class h4 {
    public static void main(String[] args) {
        int n, i, j,flag = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the numbe:");
        n = s.nextInt();
        for (i = 2; i < 1000; i++) {
            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                list.add(i);
        }
        System.out.print("\n"+n+"th prime number is:"+list.get(n-1));
        for(i=0;i<n;i++)
            System.out.print("\n"+list.get(n+i));

    }
}

