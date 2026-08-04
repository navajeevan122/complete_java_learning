import java.util.Scanner;

class SumOfNaturalSquares
{
    void squareSum(int a)
    {
        int sum=0;
        for(int i=1;i<=a ;i++)
        {
            sum=sum+(i*i);
        }
        System.out.println("the sum of squares of natural numbers: "+sum);

    }
}

public class SumOfSquares {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number upto SumOfSquares: ");
        n=sc.nextInt();
        SumOfNaturalSquares so=new SumOfNaturalSquares();
        so.squareSum(n);
    }
}
