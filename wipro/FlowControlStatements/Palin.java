import java.util.Scanner;

class Palin 
{

    static int checkPalin(int n)
    {
        int temp=n,rev=0;
        while(n!=0)
        {
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        if(rev==temp)
            return 1;
        else 
        return 0;
    }


    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ji ab input dijiye");
        int ip=scan.nextInt();

        if(checkPalin(ip)==1)
            System.out.print("hai ji palindrom");
        else 
            System.out.print("na ji nahi hai");
    }
}