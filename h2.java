import java.util.Scanner;
class h2
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num,f=0,n,i,c=0;
        int a[]=new int[100];
        System.out.println("enter number:");
        num= s.nextInt();
        System.out.println("enter nth value:");
        n=s.nextInt();
        for(i=1;i<num;i++) {
            if (num % i == 0) {
                f++;
                a[c] = i;
                c++;
            }

        }
        System.out.println("the no factors of "+num+"is:"+f);
        System.out.println(n+"th factor is:"+a[n-1]);
    }
}
