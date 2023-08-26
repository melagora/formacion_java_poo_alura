package sv.com.bytebank.test;

public class TestWrappers {
	public static void main(String[] args) {
		
		Double numeroDouble = 33.0; //autoboxing
		Boolean verdadero = true;
		
		Double numeroDouble2 = Double.valueOf(33);
		System.out.println(numeroDouble2);
		
		String numeroString = "43";
		String numeroString2 = new String("43");
		
		Double stringToDouble = Double.valueOf(numeroString);
		Integer stringToInteger = Integer.valueOf(numeroString);
		
		System.out.println(stringToDouble);
		System.out.println(stringToInteger);
		
		Number numero = Integer.valueOf(5);
		double numeroDoublePrim = numero.doubleValue();
		
		System.out.println(numeroDoublePrim);
		
		Boolean falso = Boolean.FALSE;
		
		System.out.println(falso);
	}
}
