package CodeWars.Mathematics;

public class BitCountig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countBits(1234));
	}
	public static int countBits(int n){
		// Show me the code!
		
		int modNumber =n;
		int countBits =0;
		do{
			countBits+=modNumber%2;
			modNumber = modNumber/2;
		}while(modNumber>0);
		
		return countBits;
			
	}
}


