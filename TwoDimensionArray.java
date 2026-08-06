import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.print("Enter no of rows and columns: ");
        row=sc.nextInt();
        col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Priting the 2D array: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

}
