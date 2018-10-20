import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Insira a expressao");
		Scanner scanner = new Scanner(System.in);
		Parser parser = new Parser();
		Arvore arvore = parser.parse(scanner.next());
		arvore.imprimir();
		System.out.println();
	}
}
