import java.util.Scanner;

class StaPrime
{
    static String staMethod(int a)
    {
        int flag=1;
        if(a<2)
        {
            flag=0;
        }
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            return "Prime Number";
        }
        else{
            return "Not prime number";
        }
    }
}

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter value: ");
        a=sc.nextInt();
        System.out.println("The number is "+StaPrime.staMethod(a));
    }
}
