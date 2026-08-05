import java.util.Scanner;

class Fact{
    void factorial(int n)
    {
        int i,fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Fact of N: "+fact);
    }
}

public class Factorial{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter value: ");
        a=sc.nextInt();
        Fact ob=new Fact();
        ob.factorial(a);
    }   
}