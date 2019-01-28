
import java.util.*;
class ColorSwitch
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        char ip=scan.next().charAt(0);

        switch(ip)
        {
            case 'R':
                System.out.println("laal duppatta...");
                break;
            case 'B':
                System.out.print("neele neele ambar pe...");
                break;
            case 'G':
                System.out.print("hari hari chudiyaan...");
                break;
            case 'O':
                System.out.print("santar hai gol gol...");
                break;
            case 'Y':
                System.out.print("yellow yellow dirty fellow");
                break;
            case 'W':
                System.out.print("Wlater White");
                break;
            default:
                System.out.print("kya yaaaar !");
        }
    }
}