package dio.digitalinnovation.one.strategy;

/*
 * @Author : KLEBERSON
 * 
 * Ao utilizar a Interface como Tipo de Dado
 * eu posso implementar qualquer classe que implemente
 * a interface Comportamento
 * 
 * */

public class Robo {
	
	private Comportamento comportamento;
	
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
