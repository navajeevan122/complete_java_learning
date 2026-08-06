import java.util.Scanner;

class Run
{
    public int[] returnArr(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;

        return new int[] {a,b};
        
    }
}


public class ReturnSwapVarAsArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter a ,b values: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Run rn=new Run();
        int[] arr=rn.returnArr(a,b);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}