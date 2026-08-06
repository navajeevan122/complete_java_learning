import java.util.Scanner;

public class MatrixSum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row1,col1;
        int row2,col2;
        System.out.print("Enter no of rows and columns for matrix 1: ");
        row1=sc.nextInt();
        col1=sc.nextInt();
        System.out.print("Enter no of rows and columns for matrix 2: ");
        row2=sc.nextInt();
        col2=sc.nextInt();
        int[][] arr1=new int[row1][col1];
        System.out.println("Enter matrix1: ");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        int arr2[][]=new int[row2][col2];
        System.out.println("Enter matrix2: ");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
            
        }
        int sum[][]=new int[row1][col1];
        if((row1==row2)&&(col1==col2))
        {
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col1;j++)
                {
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
        }
        System.out.println("sum of matrices: ");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
            
        }
        
    }

}
