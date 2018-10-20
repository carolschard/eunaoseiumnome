import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Parser parser = new Parser();
		Arvore arvore = parser.parse(reader.readLine());
		arvore.imprimir();
	}
}
