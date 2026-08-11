import java.util.Arrays;
import java.util.Scanner;

public class ArrayCompare {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter size of array1: ");
        n=sc.nextInt();
        int m;
        System.out.print("Enter size of array2: ");
        m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];

        System.out.print("Enter array1 elements: ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.print("Enter array2 elements: ");
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println(Arrays.compare(arr1,arr2));


    }
    
}
