package dio.digitalinnovation.one.singleton;

/*
 * @author : kleberson
 *Esse singloton apresado ao ser instanciado 
 *cria uma nova instancia ser se preocupar em verificar uma nova instancia
 * */

public class SinglotonApresado {

	private static SinglotonApresado instancia = new SinglotonApresado();
	
	private SinglotonApresado() {
		super();
	}
	
	public static SinglotonApresado getInstancia() {
		return instancia;
	}
}
