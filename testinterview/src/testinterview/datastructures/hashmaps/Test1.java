/**
 * 
 */
package testinterview.datastructures.hashmaps;

/**
 * @author ringo
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 0;
		long number = 10;
		if( number == 0)
		{
			System.out.println("result :"+result );
			
		}
		else
		{
			for (int i = 0; i<=32; i++)
			{
				if( number % 2 == 1)
				{
					result++;
				}
				number = number/2;
			}

			System.out.println("result :"+result);
		}
		
	}

}
