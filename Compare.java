// comparing the string literals and new keyword String objects(using == )


public class Compare {
    public static void main(String args[])
    {
        String s1="hello";
        String s2="hello";
        if(s1==s2)// the s1 and s2 reference are same (because they share same memory location)
        {
            System.out.println("Strings are located at same heap position");//String literals share same memory location if the String are name
        }
        else{
            System.out.println("Strings are not located at same position");
        } 
        
        String s3=new String("hello");
        String s4=new String("hello");

        if(s1==s3)//== checks the reference(s1 and s3 references are not same)
        {
            System.out.println("Strings are located at same heap position");
        }
        else{
            System.out.println("Strings are not located at same position");
        }

        if(s3==s4)//create different objects because they use new keyword and == checks the refernce
        {
             System.out.println("Strings are located at same heap position");
        }
        else{
            System.out.println("Strings are not located at same position");
        }



    }
}
