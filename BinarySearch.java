// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class SearchClass
{
    public void search(int arr[],int key,int n)
    {
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]==key)
            {
                System.out.println("Key found at index: "+mid);
                return;
            }
            else if(arr[mid]<key)
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        System.out.println("Not found");
    }
}

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter array size: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements in ascending order : ");
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
