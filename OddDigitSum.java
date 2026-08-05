import java.util.Scanner;

class OddDigSum{
    void odddigitsum(int digit)
    {
        int sum=0;
        while(digit>0)
        {
            int rem=digit%10;
            if(rem%2!=0)
            {
                sum+=rem;
            }
            digit/=10;
        }
        System.out.println("Odd Digit Sum is: "+sum);
    }
}

public class OddDigitSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int digit;
        System.out.println("Enter digit: ");
        digit=sc.nextInt();
        OddDigSum ds=new OddDigSum();
        ds.odddigitsum(digit);
    }
}
