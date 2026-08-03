class Multiply
{
    static void multiplication(int a,int b)
    {
        System.out.println(a*b);
    }
}

public class StaticMethod {
    public static void main(String args[])
    {
        Multiply.multiplication(4,5);
    }
}
