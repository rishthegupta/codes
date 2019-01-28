import java.util.Scanner;

class FirstFiveValue
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=0,i;

        while(true)
        {
            
            
            for(i=2;i<(5*i);i++)
            {
                if(n==5)
                break;
                if((i%2==0) && (i%3==0) && (i%5==0))
                    {
                    System.out.println("ji "+i);
                    n++;
                    }
            }
        }
    }
}