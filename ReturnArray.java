 import java.util.Scanner;

class ArrReturn{
    public int[] arrayUpdate(int arr[])
    {
        int n=arr.length;
        for(int i=0; i<n ;i++)
        {
            arr[i]=arr[i]+2;
        }
        return arr;
    }
} 

public class ReturnArray
{
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
        ArrReturn as=new ArrReturn();
        int[] arr1=as.arrayUpdate(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }


    }
}
