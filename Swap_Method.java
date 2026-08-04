abstract class Abstract{
    abstract int[] swap(int a,int b);
}
class Child extends Abstract{
    int[] swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        return new int[]{a,b};
    }
}

public class Swap_Method {
    public static void main(String args[])
    {
        int a=10,b=20;
        Child ch=new Child();
        int res[]=ch.swap(a, b);
        System.out.println("a: "+res[0]+" "+"b: "+res[1]);
    }
}
