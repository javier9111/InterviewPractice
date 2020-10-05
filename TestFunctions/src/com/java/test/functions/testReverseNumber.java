package com.java.test.functions;

public class testReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = reverse(1231231235);
		System.out.println("result: "+number);
		
	}
    public static int reverse(int x) {
        
        String number = Integer.toString(x);
        int result = 0;
         String sresult="";
         System.out.println("before: "+number+" length:"+ number.length()+ "charat0: "+number.charAt(0));
        if(x > 0)
        {
           System.out.println("hello");
           int count = number.length()-1;
           	while(count>=0)
           	{
           		System.out.println(count);
                sresult= sresult+ number.charAt(count);
                System.out.println("up: "+sresult);
                count= count -1;
                System.out.println(count);
            }
            return Integer.parseInt(sresult);
        }
        else if( x < 0 )
        {
            int count = number.length()-1;
        	while(count>=1)
           	{
           		System.out.println(count);
                sresult= sresult+ number.charAt(count);
                System.out.println("up: "+sresult);
                count= count -1;
                System.out.println(count);
            }
            return Integer.parseInt(sresult)*-1;
        }
        else
        {
            return 0;
        }
    }
}
