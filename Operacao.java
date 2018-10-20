public class Operacao extends Arvore {
	private char operador;
	private Arvore esq;
	private Arvore dir;
	public Operacao(Arvore esq, char operador, Arvore dir) {
		this.operador = operador;
		this.esq = esq;
		this.dir = dir;
	}
	public void imprimir() {
		System.out.print("(");
		esq.imprimir();
		System.out.print(operador);
		dir.imprimir();
		System.out.print(")");
	}
}
