package dio.digitalinnovation.one.singleton;

/*
 * @author : kleberson
 * Esse singloton deve ser chamado, ele não irá
 * entregar a instancia para voce sem ser chamado
 * */

public class SinglotonPreguicoso {

	private static SinglotonPreguicoso instancia;
	
	private SinglotonPreguicoso() {
		super();
	}
	
	public static SinglotonPreguicoso getInstancia() {
		if(instancia == null) {
			instancia = new SinglotonPreguicoso();
		}
		
		return instancia;
	}
}
