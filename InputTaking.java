import java.util.Scanner;

public class InputTaking {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of one word: ");
        String s=sc.next();
        sc.nextLine();
        //after using the next() we use nextLine() toleftover to next line

        System.out.println("Enter the sentence: ");
        String s1=sc.nextLine();
        //  new keyword
        System.out.println("Enter the sentence stored using new keyword: ");
        String s2=new String(sc.nextLine());
        
        String s3=new String(s);

        System.out.println("One word String is "+s);
        System.out.println("Sentence is: "+s1);

        System.out.println("New keyword String: "+s2);
        System.out.println(s3);


    }
    
}
