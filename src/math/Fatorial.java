package math;

public class Fatorial {

	public static int getFatorial(int number) {
		if(number < 0)
			throw new IllegalArgumentException("Números negativos não são permitidos.");
		
		if(number == 0)
			return 1;
		
		return number * getFatorial(number - 1);
	}
}
