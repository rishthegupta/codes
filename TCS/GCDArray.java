class GCDArray
{
    static int gcd(int a, int b)
    {
    if (a == 0)
        return b;
    return gcd(b % a, a);
    }



    public static void main(String args[])
    {

        int op,i;
        if(args.length>0)
        {
            int n=Integer.parseInt(args[0]);
            int ip[]=new int[n];
            for(i=0;i<n;i++)
                ip[i]=Integer.parseInt(args[i+1]);

            op=ip[0];

            for(i=1;i<n;i++)
            {
                op=gcd(op,ip[i]);
            }

            System.out.println("GCD of these numbers is "+op);
        }
        else
            System.out.print("aji argument please ! ");
    }
}