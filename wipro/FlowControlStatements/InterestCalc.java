class InterestCalc
{
    public static void main(String args[])
    {
        if(args.length==2)
        {
            
            String ip=args[0],m="Male",f="Female";
            int age=Integer.parseInt(args[1]);
            
            if(ip.equals(m))
            {
                
                if(age>=1 && age<=60)
                    System.out.print("9.2 % de dijiye");
                else if(age>=61 && age<=120)
                    System.out.print("8.3 % de dijiye chacha");
            }
            else if(ip.equals(f))
            {
                if(age>=1 && age<=60)
                    System.out.print("8.2 % de dijiye mem saheb");
                else if(age>=61 && age<=120)
                    System.out.print("7.6 % de dijiye chachi");
            }
        }

        else 
            System.out.print("argument to deii do bhaiya !");
    }

}