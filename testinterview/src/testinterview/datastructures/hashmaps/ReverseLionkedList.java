package testinterview.datastructures.hashmaps;

public class ReverseLionkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println(reverseNum(807));
	}
	
    public static int reverseNum(int num) {
        int reversedNum = 0;
        boolean isNegative = (num < 0);
        num = Math.abs(num);
        
        while (num > 0) {
            int digit = num % 10;
            System.out.println("this is the digit:"+digit);
            num /= 10;
            System.out.println("this is the num:"+num);
            reversedNum *= 10;
            System.out.println("this is the reverse:"+reversedNum);
            reversedNum += digit;
            System.out.println("this is the sum:"+reversedNum);
        }
        
        return isNegative ? -reversedNum : reversedNum;
    }

}
