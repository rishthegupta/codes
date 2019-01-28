import java.util.*;
class CaseChange
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("kuch dabaiye to");
        char ip=scan.next().charAt(0);
        int ipn=(int)ip;

        if(ipn>=65 && ipn<=90)
        {
            ipn=ipn+32;
            System.out.print((char)ipn);
        }
        else if(ipn>=97 && ipn<=122)
        {
            ipn=ipn-32;
            System.out.print((char)ipn);
        }
    }
}