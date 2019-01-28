import java.util.Scanner;

class ReverseNumber 
{

    static int reverseIt(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=(rev*10)+(n%10);
            n=n/10;
        }
       return rev;
    }


    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ji ab input dijiye");
        int ip=scan.nextInt();

       System.out.println("ye lijiye utla "+reverseIt(ip));
    }
}