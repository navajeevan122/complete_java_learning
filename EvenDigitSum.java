import java.util.Scanner;

class EvenDigSum{
    void evendigitsum(int digit)
    {
        int sum=0;
        while(digit>0)
        {
            int rem=digit%10;
            if(rem%2==0)
            {
                sum+=rem;
            }
            digit/=10;
        }
        System.out.println("Odd Digit Sum is: "+sum);
    }
}

public class EvenDigitSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int digit;
        System.out.println("Enter digit: ");
        digit=sc.nextInt();
        EvenDigSum ds=new EvenDigSum();
        ds.evendigitsum(digit);
    }
}
