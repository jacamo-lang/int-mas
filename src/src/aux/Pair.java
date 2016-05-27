package aux;

/**
 * Classe Pair<br>
 * Classe auxiliar para controlar conexões entre vértices
 * @author Maicon Rafael Zatelli
 *
 */
public class Pair {
	private Object a;
	private Object b;
	private int hash;
	
	/**
	 * Construtor da classe Pair
	 * @param a
	 * @param b
	 */
	public Pair(Object a, Object b) {
		this.a = a;
		this.b = b;
		
		hash = (a.hashCode() ^ (b.hashCode() >> 1));
	}
	
	/**
	 * Compara a Pair
	 */
	public boolean equals(Object obj) {	
		return  ((Pair) obj).a.equals(a) && ((Pair) obj).b.equals(b);
	}
	
	/**
	 * Retorna um código hash para a Pair
	 */
	public int hashCode() {
		return hash;
	}

	/**
	 * Retorna o objeto A
	 * @return a
	 */
	public Object getA() {
		return a;
	}
	
	/**
	 * Retorna o objeto B
	 * @return b
	 */
	public Object getB() {
		return b;
	}
}
