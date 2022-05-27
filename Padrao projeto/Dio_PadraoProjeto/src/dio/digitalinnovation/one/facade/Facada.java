package dio.digitalinnovation.one.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facada {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
		
	}
}
