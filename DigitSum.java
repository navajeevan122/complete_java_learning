import java.util.Scanner;

class DigSum{
    void digitsum(int digit)
    {
        int sum=0;
        while(digit>0)
        {
            int rem=digit%10;
            sum+=rem;
            digit/=10;
        }
        System.out.println("Digit Sum is: "+sum);
    }
}

public class DigitSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int digit;
        System.out.println("Enter digit: ");
        digit=sc.nextInt();
        DigSum ds=new DigSum();
        ds.digitsum(digit);
    }
}
