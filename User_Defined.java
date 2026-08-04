import java.util.Scanner;
class Method1{
    public String leapYear(int year)
    {
        if((year%4==0 && year%100!=0) || (year%400==0))
        {
            return "LeapYear";
        }
        else{
            return "Non-leapYear";
        }
    }
}


public class User_Defined{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        Method1 yr=new Method1();
        int year;
        System.out.println("Enter year: ");
        year=ob.nextInt();
        System.out.println("The year is "+yr.leapYear(year));

    }
}