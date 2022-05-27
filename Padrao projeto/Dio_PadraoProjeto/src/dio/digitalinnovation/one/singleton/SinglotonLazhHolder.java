package dio.digitalinnovation.one.singleton;

public class SinglotonLazhHolder {

	private static class InstancieHolder{
		public static SinglotonLazhHolder instancia = new SinglotonLazhHolder();
	}
	
	private SinglotonLazhHolder() {
		super();
	}
	
	public static SinglotonLazhHolder getInstancia() {
		return InstancieHolder.instancia;
	}
}
