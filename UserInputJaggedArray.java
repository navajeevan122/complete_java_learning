// taking input for jagged array


import java.util.Scanner;
public class UserInputJaggedArray {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int row;
        System.out.print("Enter no of rows: ");
        row=sc.nextInt();
        int arr[][]=new int[row][];
        int col;
        System.out.print("Enter no of cols for each row: ");
        for(int i=0;i<arr.length;i++)
        {
            col=sc.nextInt();
            arr[i]=new int[col];
        }
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The jagged array is: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
