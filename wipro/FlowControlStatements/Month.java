class Month
{
    public static void main(String args[])
    {
        int ip;

        if(args.length>0)
        {
            ip=Integer.parseInt(args[0]);
        
            switch(ip)
            {
                case 1:
                    System.out.println("piyush, sarwar, gori ka birthday");
                    break;
                case 2:
                    System.out.println("umang ka birthday");
                    break;
                case 3:
                    System.out.println("bhai ka birthday");
                    break;
                case 4:
                    System.out.println("popat bhai, minu bhen ka birthday");
                    break;
                case 5:
                    System.out.println("banty bro ka birthday");
                    break;
                case 6:
                    System.out.println("mochu ka birthday");
                    break;
                case 7:
                    System.out.println("paji balle balle");
                    break;
                case 8:
                    System.out.println("koi paida nahi ua tha");
                    break;
                case 9:
                    System.out.println("romit bro");
                    break;
                case 10:
                    System.out.println("sam sir");
                    break;
                case 11:
                    System.out.println("special month, rahul bro");
                    break;
                case 12:
                    System.out.println("NRI bc");
                    break;
                default:
                    System.out.print("koi nahi bhai, pahle std KG le !");
            }
        }

        else
            System.out.print("bhai argument !");
    }
}