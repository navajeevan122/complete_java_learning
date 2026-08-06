import java.util.Scanner;

class ArrSum{
    public void arraySum(int arr[])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0; i<n ;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Array Sum is: "+sum);
    }
} 

public class ArraySum{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrSum as=new ArrSum();
        as.arraySum(arr);
    }
}