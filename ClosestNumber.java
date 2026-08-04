//n=13 and m=4  the output is 12 because output closer to n and divisible by m

import java.util.Scanner;

class Close
{
    int quotient(int n,int m)
    {
        int q=n/m;
        //finding first closer value
        int n1=m*q;
        //finding second closer value
        int n2=(n*m>0)?(m*(q+1)):(m*(q-1));

        if((Math.abs(n-n1))<(Math.abs(n-n2)))
        {
            return n1;
        }
        return n2;

    }
} 

public class ClosestNumber {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int n,m;
        System.out.println("number: ");
        n=ob.nextInt();

        System.out.println("Divisor: ");
        m=ob.nextInt();

        Close cs=new Close();
        int res=cs.quotient(n, m);
        System.out.println("closest number is "+res);
    }
}
