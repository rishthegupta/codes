class PrintPrime
{
    static int checkPrime(int n)
    {
        int i;
        for(i=2;i<Math.sqrt(n);i++);
        {
            if(n%i==0)
            return 0;
        }
        return 1;
    }


    public static void main(String args[])
    {
        if(args.length>0)
        {
            int ip1=Integer.parseInt(args[0]);
            int ip2=Integer.parseInt(args[1]);
            for(int j=ip1;j<=ip2;j++)
            {
                if(checkPrime(j)==1)
                    System.out.println(j);
            }
        }
        else
            System.out.println("aji argument to dijiye");
    }
}