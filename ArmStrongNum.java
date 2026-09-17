import java.lang.Math;

class ArmStrongNum {
    public static void main(String[] args) {
        int n=153;
        int original=n;
        int digits=0;
        while(n>0)
            {
                digits++;
                n=n/10;
            }
        n=original;
        int res=0;
        while(n>0)
            {
                int digit=n%10;
                int pow=1;
                for(int i=0;i<digits;i++)
                    {
                        pow*=digit;
                    }
                res=res+pow;
                n=n/10;
            }
        if(res==original)

        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}