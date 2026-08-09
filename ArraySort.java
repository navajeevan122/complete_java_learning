import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    
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
        Arrays.sort(a);
        System.out.println("the sorted array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));  //toString methods converts int array into string array the output in the square brackets
    }

}
