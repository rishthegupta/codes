//Sort the numbers input through command line argument
import java.util.Arrays;    


class Addon1
{
    public static void main(String args[])
    {
        int l=args.length,i;
        int a[]=new int[l];

        if(l>0)
        {
            for(i=0;i<l;i++)
            {
                a[i]=Integer.parseInt(args[i]);
            }

            Arrays.sort(a, 0, l);

            for(i=0;i<l;i++)
            {
                System.out.println(a[i]);
            }
        }

        else
        System.out.print("No Argument passed");

    
    }
}