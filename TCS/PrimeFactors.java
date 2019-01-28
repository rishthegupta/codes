class PrimeFactors
{
    
    static void findPrimeFactor(int n)
    {
        int i=0;
        while(n%2==0)
        {
            System.out.print("2 ");
            n=n/2;
        }
        for(i=3;i<Math.sqrt(n);i=i+2)
        {
            while(n%i==0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>2)
        System.out.print(n+" ");
        
    }
    
    public static void main(String args[])
    {

        int ip;
        if(args.length>0)
        {
            ip=Integer.parseInt(args[0]);
            findPrimeFactor(ip);
        }

        else
            System.out.print("enter argument");
    }
}