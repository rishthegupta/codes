import java.util.*;

class NumPosNeg
{
    public static void main(String args[])
    {
        
        int s;
        
        
        if(args.length>0)
        {
            s=Integer.parseInt(args[0]);
            if(s==0)
                System.out.print("Zero");
            else if(s<0)
                System.out.print("Negative");
            else 
                System.out.print("Positive");
        }

        else
        {
            System.out.print("No Argument found");
        }

    }
}