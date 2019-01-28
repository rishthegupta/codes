import java.util.Arrays;



class CheckAnagram
{
    public static void main(String args[])
    {
        if(args.length>0)
        {
            char ip1[]=args[0].toCharArray();
            char ip2[]=args[1].toCharArray();
            int i,flag=0;
            int ip1c[]=new int[ip1.length];
            int ip2c[]=new int[ip2.length];

            for(i=0;i<ip1.length && i<ip2.length;i++)
                {
                    ip1c[i]=(int)ip1[i];
                    ip2c[i]=(int)ip2[i];
                }
            Arrays.sort(ip1c);
            Arrays.sort(ip2c);
            
            for(i=0;i<ip1.length && i<ip2.length;i++)
            {
                if(ip1c[i]==ip2c[i])
                {
                    flag=1;
                }
                else 
                    flag=0;
            }

            if(flag==1)
                System.out.print("Anagram");
            else
                System.out.print("Not Anagram");
           

            

            
            

            

        }
        else
            System.out.print("aji argument de deijiye !");
    }
}