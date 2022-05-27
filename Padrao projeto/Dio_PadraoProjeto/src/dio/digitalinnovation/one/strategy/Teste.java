package dio.digitalinnovation.one.strategy;

public class Teste {

	public static void main(String[] args) {

		Comportamento defensivo = new Defensivo();
		Comportamento explorador = new Explorador();
		Comportamento agressivo = new Agressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(agressivo);
		robo.mover();
		
		robo.setComportamento(explorador);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
	}

}
