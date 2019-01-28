class BubbleSort
{
    static void bubbleSort(int ip[], int n)
    {
        int temp,i,j;
        System.out.println("Unsodted");
        for(i=0;i<n;i++)
            System.out.print(ip[i]+" ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                temp=ip[j];
                ip[j]=ip[j+1];
                ip[j+1]=temp;
            }
        }
        System.out.println();
        for(i=0;i<n;i++)
            System.out.print(ip[i]+" ");
    }

    public static void main(String args[])
    {
        int n,i;
        if(args.length>0)
        {
            n=Integer.parseInt(args[0]);
            int ip[]=new int[n];
            for(i=0;i<n;i++)
            {
                ip[i]=Integer.parseInt(args[i+1]);
            }
            bubbleSort(ip, n);


        }

        else
            System.out.print("enter some argument bro !");
    }


}