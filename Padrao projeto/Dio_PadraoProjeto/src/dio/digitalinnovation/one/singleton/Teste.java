package dio.digitalinnovation.one.singleton;

public class Teste {

	public static void main(String[] args) {
		
		SinglotonPreguicoso preguicoso = SinglotonPreguicoso.getInstancia();
		System.out.println(preguicoso);
		preguicoso = SinglotonPreguicoso.getInstancia();
		System.out.println(preguicoso);
		
		System.out.println("------------------------------------------------");
		
		SinglotonApresado apresado = SinglotonApresado.getInstancia();
		System.out.println(apresado);
		apresado = SinglotonApresado.getInstancia();
		System.out.println(apresado);
		
		System.out.println("------------------------------------------------");
		
		SinglotonLazhHolder utilizado = SinglotonLazhHolder.getInstancia();
		System.out.println(utilizado);
		utilizado = SinglotonLazhHolder.getInstancia();
		System.out.println(utilizado);
		
		
	}

}
