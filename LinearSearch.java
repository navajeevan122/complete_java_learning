import java.util.Scanner;

class SearchClass
{
    public void search(int arr[],int key,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("key found at index: "+i);
                return;
            }
        }
        System.out.println("key not found");
    }
}

class LinearSearch 
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter array size: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key to search: ");
        int key=sc.nextInt();
        SearchClass bs=new SearchClass();
        bs.search(arr,key,n);

    }


}
