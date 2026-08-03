class Addition
{
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}


public class Add_Method {
    public static void main(String args[]){
        Addition sc=new Addition();
        sc.add(10,20);
        // user defined method accessed using the class object
    }
}
