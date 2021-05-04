package numeropar;

public class TestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String cadena = "thisman_20201210.txt";
		
		int extexionIndex = cadena.indexOf(".txt");
		
		String cadenaDia = cadena.substring(extexionIndex-8, extexionIndex);
		
		System.out.println(cadenaDia);
		
	}

}
