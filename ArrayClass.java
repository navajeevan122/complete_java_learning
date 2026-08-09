import java.util.Arrays;
import java.util.Scanner;

class ArrayClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter Size of array: ");
        n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0 ;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("The array list is: "+Arrays.asList(a));
    }
}