//finding maximum element in the array using the for-each

import java.util.Scanner;

class MaxMethod{
public void maxMethod(int a[])
{
    int max_val=Integer.MIN_VALUE;
    for(int item:a)
    {
        if(item>max_val)
        {
            max_val=item;
        }
    }
    System.out.println("Max value is: "+max_val);

}
}

public class FindMax {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        MaxMethod mm =new MaxMethod();
        mm.maxMethod(a);

    }
    
}
