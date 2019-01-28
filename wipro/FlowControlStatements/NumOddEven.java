
class NumOddEven
{
    public static void main(String args[])
    {
        int s;
        if(args.length>0)
        {
            s=Integer.parseInt(args[0]);
            if(s%2==0)
                System.out.println("Even");
            else 
                System.out.println("Odd");
        }

        else
            System.out.print("No Argument Passed");
    }
}