class ReverseAString
{
    public static void main(String args[])
    {
        int i;
        if(args.length>0)
        {
           for(i=args.length-1;i>=0;i--)
            {
                System.out.print(args[i]+" ");
            }

        }
        else
            System.out.print("enter an argument");
    }
}