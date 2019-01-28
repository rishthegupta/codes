class PrimePalin
{
    static int checkPrime(int n)
    {
        int i;
        for(i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
                return 0;

        }

        return 1;
    }

    static int checkPalin(int n)
    {
        int rev=0,temp=n;
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
        
        int ip,i,p,pl;
        if(args.length>0)
        {
            ip=Integer.parseInt(args[0]);
            
           
            for(i=1;i<=ip;i++)
            {
                p=checkPalin(i);
                pl=checkPrime(i);
                if((p==1) && (pl==1))
                {
                    System.out.println(i);
                }
                
            }
            

        }
        else
            System.out.println("Aji argument to dijyiye !");
    }
}