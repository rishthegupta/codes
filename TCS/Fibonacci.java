class Fibonacci
{
    static void printFib(int n)
    {
        int op[]=new int[n];
        int i;
        op[0]=0;
        op[1]=1;
        System.out.print(op[0]+" "+op[1]+" ");
        for(i=2;i<n;i++)
        {
            op[i]=op[i-2]+op[i-1];
            System.out.print(op[i]+" ");
        }
    }

    public static void main(String args[])
    {
        if(args.length>0)
        {
            int ip=Integer.parseInt(args[0]);
            printFib(ip);
        }

        else
            System.out.print("enter some argument bro ");
    }
}