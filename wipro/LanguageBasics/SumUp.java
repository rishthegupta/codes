class SumUp
{
    public static void main(String args[])
    {
        int sum;
        if(args.length>0)
        {
            sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);

            System.out.println("the sum of "+args[0]+" and "+args[1]+" is "+sum);
        }
        else 
        {
            System.out.println("No Argument Passed");
        }
    }
}