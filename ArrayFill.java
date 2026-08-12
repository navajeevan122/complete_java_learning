import java.util.Arrays;
import java.util.Scanner;

public class ArrayFill {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter size of the array: ");
        n=sc.nextInt();

        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to fill: ");
        int key=sc.nextInt();

        Arrays.fill(arr,key);
 
        System.out.println("the array after filling with key element: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


    }
    
}
