//finding maximum element in the array using the for-each

import java.util.Scanner;

class MinMethod{
public void minMethod(int a[])
{
    int min_val=Integer.MAX_VALUE;
    for(int item:a)
    {
        if(item<min_val)
        {
            min_val=item;
        }
    }
    System.out.println("Min value is: "+min_val);

}
}

class FindMin {
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

        MinMethod mm =new MinMethod();
        mm.minMethod(a);

    }
    
}
