// Input: n = 2
// Output: 5
// Explanation: For dice facing number 5 opposite face will have the number 2.

// Input: n = 6
// Output: 1
// Explanation: For dice facing number 6 opposite face will have the number 1.
// in dice sum of any oppposite side is 7
import java.util.Scanner;
class DiceEx
{
    void dicemethod(int s){
        int sum_of_two_sides=7;
        System.out.println("the another side is "+(sum_of_two_sides-s));
    }
}

public class Dice {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int a;
        System.out.println("enter the dice side :");
        a=ob.nextInt();
        DiceEx de=new DiceEx();
        de.dicemethod(a);
    }
}
