package leetCode;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int value1= 38;
		
		
		int result = addDigits(value1);
	}

	
	 public static int addDigits(int num) {
	        if(num<=9) return num;


	        int sum = 0;
	        int tempNum =0;
	        while(num != 0){
	            tempNum = num%10;
	            sum+=tempNum;
	            num = num/10;
	            if(num == 0){
	                num = sum;
	                if(num <=9) break;
	                sum = 0;
	            }
	        }
	        return num; 
	    }
}
