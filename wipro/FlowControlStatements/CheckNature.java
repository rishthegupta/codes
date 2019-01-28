import java.util.*;
class CheckNature
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ip = sc.next().charAt(0);
        
        
           
            int ipn=(int)ip;
            
                if((ipn>=65 && ipn>=90) ||(ipn>=97 && ipn<=122))
                    System.out.println("Mr Alphabet");
                else if(ipn>=48 && ipn<=57)
                    System.out.print("Number hai bhaiya");
                else
                    System.out.print("Special hai ji");
    }
        
      
   
}