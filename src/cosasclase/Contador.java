package cosasclase;

/*
 * Clase que representa un contador
 * 
 * Contador > cont
 * 	-incrementar
 * 	-decrementar
 * 
 * 	Limitacion: El contador nunca puede tener valores negativos
 * 
 */

public class Contador {
	
	private int cont;
	
	/**
	 * Constructor con valor inicial
	 * 
	 */
	public Contador(int cont) {
		setCont(cont);
	}
	
	/**
	 * Constructor por defecto
	 */
	public Contador() {
		setCont(0);
	}

	// GETTER Y SETTER
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}
	
	/**
	 * Incrementar el contador en una unidad
	 */
	public void incrementar() {
		incrementar(1);
	}
	
	/**
	 * Incrementar el contador en cierta cantidad de unidades
	 * @param suma cantidad que se incrementa al contador
	 */
	public void incrementar(int suma) {
		if (suma >= 0) {
			cont+=suma;
		}
	}
	
	/**
	 * Decrementa el contador en una unidad
	 * Si llega a negativo se devuelve a 0
	 */
	
	public void decrementar() {
		decrementar(1);
		
		if (cont < 0) {
			cont = 0;
		}
	}
	
	/**
	 * Decrementa el contador en un numero de unidades
	 * @param resta cantidad que se decrementa al contador
	 * Si llega a negativo se devuelve a 0
	 */
	public void decrementar(int resta) {
		cont -= resta;
		
		if (cont < 0) {
			cont = 0;
		}
	}

	@Override
	public String toString() {
		return "Contador [cont=" + cont + "]";
	}
	
	
	
}
