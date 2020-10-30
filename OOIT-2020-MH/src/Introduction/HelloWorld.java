package Introduction;

public class HelloWorld {

	public static void main(String[] args) {
		// Ovo je komentar
		System.out.println("Hello, World!");
		
		// PROMENLJIVE
		int firstNumber = 4;
		double secondNumber = 4.4;
		
		double sum = firstNumber + secondNumber;
		System.out.println(sum);
		
		char c = ' ';
		String firstName = "Petar";
		String lastName = "Petrovic";
		System.out.println("Student: " + firstName + c + lastName);
		
		boolean bool = true;
		
		// USLOVI
		int a = 24;
		int b = 12;
		char operation = '*';
		
		int result = -1;
		
		if (operation == '+') {
			result = a + b;
		}
		else if (operation == '-') {
			if (a > b) {
				result = a - b;
			} else {
				result = b - a;
			}
		}
		else if (operation == '*') {
			result = a * b;
		}
		else if (operation == '/') {
			result = a / b;
		}
		else {
			System.out.println("Nedozvoljeni unos!");
		}
		
		System.out.println("Rezultat je: " + result);
		
		// PETLJE
		int f = 5;
		int sumF = 1;
		while (f > 0) {
			sumF = sumF * f;
			f--;
		}
		System.out.println("Faktorijel broja 5 je: " + sumF);
	}

}
