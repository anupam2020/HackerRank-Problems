//A2B=16^2x10 + 16^1x2 + 16^0x11

class Hexadecimal
{
    public static void main(String args[])
    {
        String str="A2B";
        int i,res=0,val,len=str.length(),c=len;
        char ch;
        for(i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch>='A' && ch<='F')
            {
                val=(ch-65)+10;
                res=res+(int)(val*Math.pow(16,--c));
            }
            else if(ch>='0' && ch<='9')
            {
                val=(ch-48);
                res=res+(int)(val*Math.pow(16,--c));
            }
            else
            {
                System.out.println("INVALID");
                System.exit(0);
            }
        }
        System.out.println(res);//2603
        String s="";
        while(res>0)
        {
            int r=res%2;
            s=s+r;
            res=res/2;
        }
        String rev="";
        for(i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}