package CodeWars.Arrays;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		
		String phone = createPhoneNumber(numbers);
		
			
		System.out.println(phone);
		
	}

	
	public static String createPhoneNumber(int[] numbers) {
	    // Your code here!
	    
		StringBuilder phone = new StringBuilder("(");
		
		
		for(int i=0; i<numbers.length; i++)
		{
			switch(i)
			{
				case 3:{
				 phone.append(") ");
				 phone.append(numbers[i]);
				 break;
			}
				case 6:{
					phone.append("-");
					 phone.append(numbers[i]);
					 break;
				}
				default:{
					phone.append(numbers[i]);
				}
					
			}
			
			
		}
		return phone.toString();
	  }
}
