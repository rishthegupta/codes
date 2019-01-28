class PrimeCheck
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
            int ip=Integer.parseInt(args[0]);
           
            if(checkPrime(ip)==1)
                System.out.println("hai ji prime");
           else
           System.out.println("na ji nahi hai");
        }
        else
            System.out.println("aji argument to dijiye");
    }
}