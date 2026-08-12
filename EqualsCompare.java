
public class EqualsCompare {
    public static void main(String args[])
    {
        String s1="hello";
        String s2="hello";

        String s3=new String("hello");
        String s4=new String("hello");

        if(s1.equals(s2))//data is same in both the variables
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        if(s3.equals(s1))//it doesnot checks the refenence just checks the data in the Strings
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        if(s3.equals(s4))//it doesnot checks the refenence just checks the data in the Strings
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
    
}
