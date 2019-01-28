class AddDigit
{
    public static void main(String args[])
    {
        int sum=0;
        if(args.length>0)
        {
            int ip=Integer.parseInt(args[0]);
            while(ip!=0)
            {
                sum=sum+(ip%10);
                ip=ip/10;

            }
            System.out.print("sb jod ke hua "+sum);
        }

        else
            System.out.print("aji argument de dijiye na !");
    }
}