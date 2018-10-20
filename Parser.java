public class Parser {
	private int i;
	private String str;
	private Arvore parseValor() {
		String valor = "";
		while (i < str.length()) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				valor += c;
				i ++;
			} else {
				break;
			}
		}
		return new Valor(valor);
	}
	private Arvore parse() {
		Arvore arvore = null;
		while (i < str.length()) {
			char c = str.charAt(i);
			if (c == '/' || c == '*' || c == '+' || c == '*') {
				i ++;
				Arvore esq = arvore;
				Arvore dir = parse();
				arvore = new Operacao(esq, c, dir);
			} else if (c >= '0' && c <= '9') {
				arvore = parseValor();
			} else if (c == '(') {
				i ++;
				arvore = parse();
				i ++;
				break;
			} else if (c == ')') {
				break;
			} else {
				break;
			}
		}
		return arvore;
	}
	public Arvore parse(String str) {
		this.str = str;
		i = 0;
		return parse();
	}
}
