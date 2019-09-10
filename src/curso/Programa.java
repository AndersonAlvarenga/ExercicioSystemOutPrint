package curso;

public class Programa {
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Produtos:");
		System.out.printf("%s, whitch price is $ %.2f%n",product1, price1);
		System.out.printf("%s , whitch price is $ %.2f%n%n", product2, price2);
		System.out.printf("Record: %d year old, code %d and gender: %c %n%n", age, code, gender);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		System.out.printf("US decimal point: %.3f",measure);//utilizado printf para formatar a string %.2f para colocar 2 casas apos a virgula
	}
}
