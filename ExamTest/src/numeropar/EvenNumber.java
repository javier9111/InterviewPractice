package numeropar;

public class EvenNumber {

	/***
	 * Limitantes
	 * mod, bit<, div.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number  = 5;
		
		boolean isEven = isEven(number);
		
		 int a = 5;//salida mas pequeño
		 int b = 6;//salida 5
		 int c = 1;//6
		 
		 a=a-b;
		 b=b-c;
		 c=c+b;
		 
		
	}

	
	public static boolean isEven(int number){
		
		boolean isEven = false;
		for(int i = 0; i<= number; i=i+2)
		{
			if(i==number)
			{
				isEven = true;
				return isEven;
			}
		}
		
		return isEven;
		
	}
}
