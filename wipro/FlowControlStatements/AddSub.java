import java.util.Scanner;

class AddSub
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int ip,a,b;
        char c;
        int cn;

        
        do
        {

            System.out.println("enter your chooice");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            ip=scan.nextInt();
            System.out.println("enter two numbers");
            a=scan.nextInt();
            b=scan.nextInt();
            if(ip==1)
                System.out.println("sum is "+ (a+b));
            else if(b==2)
                System.out.print("Difference is "+(a-b));
            else
                System.out.println("invalid operation");


            System.out.print("enter Y/y for continuing operation");
            c=scan.next().charAt(0);
            cn=(int)c;

        
        
        }
        while(c==89 || c==121);
        
        
    }
}