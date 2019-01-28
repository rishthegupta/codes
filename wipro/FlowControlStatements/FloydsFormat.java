class FloydsFormat
{
    public static void main(String args[])
    {
        int i,j;
        if(args.length>0)
        {
            int ip=Integer.parseInt(args[0]);
            ip=ip+1;
            for(i=0;i<ip;i++)
                {
                for(j=0;j<i;j++)
                    System.out.print("*");
                System.out.println();
                }
        }
        else
            System.out.print("aji aap nahi mananege, argument dijiye mahraaj !");
    
    }
}