
class PrintArgs
{
    public static void main(String args[])
        {
            if(args.length>0)
            {
                for(int i=0;i<args.length;i++)
                    if(i==args.length)
                        System.out.print(args[i]);
                    else
                    System.out.print(args[i]+", ");
            }
            else 
            System.out.println("No Arguments found");
        }

        
}