//3,-4,1,-1,6
//SMALLEST POSITIVE INTEGER=2
import java.util.*;
class SmallPositivePrepBytes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int i,j,min=9;
        System.out.println("Enter 5 numbers");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(arr[i]<0)
            {
                continue;
            }
            else
            {
                if(arr[i]<min)
                {
                    min=arr[i];
                }
            }
        }
        if(min!=1)
        {
            min=1;
            System.out.println("SMALLEST POSTIVE NUMBER: "+min);
            System.exit(0);
        }
        //4,2,1,-1,6
        //min=1
        for(i=0;i<5;i++)
        {
            if(arr[i]==min)
            {
                min++;
                //System.out.println(min);
                i=0;
            }
        }
        System.out.println("SMALLEST POSTIVE NUMBER: "+min);
    }
}