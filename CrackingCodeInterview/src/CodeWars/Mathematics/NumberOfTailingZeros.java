package CodeWars.Mathematics;
/***
 * Write a program that will calculate the number of trailing zeros in a factorial of a given number.

N! = 1 * 2 * 3 * ... * N

Be careful 1000! has 2568 digits...

For more info, see: http://mathworld.wolfram.com/Factorial.html

Examples
zeros(6) = 1
# 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero

zeros(12) = 2
# 12! = 479001600 --> 2 trailing zeros
Hint: You're not meant to calculate the factorial. Find another way to find the number of zeros.
 * @author ringo
 *
 */
public class NumberOfTailingZeros {

	public static void main(String[] args)
    {
		NumberOfTailingZeros ftzm=new NumberOfTailingZeros();
        int countFactorialTrailingZeros = ftzm.zeros(30);
 
        System.out.println("Factorial trailing zeroes for 29: "+countFactorialTrailingZeros);
    }
 
    public int zeros(int num)
    {
        int countOfZeros=0;
        for(int i=2;i<=num;i++)
        {
            countOfZeros+=countFactorsOf5(i);
        }
        return countOfZeros;
    }
 
    private int countFactorsOf5(int i)
    {
        int count=0;
        while(i%5==0)
        {
            count++;
            i/=5;
        }
        return count;
    }
}
