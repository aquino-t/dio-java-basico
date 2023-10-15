package funcionalidades.navegador_internet;

public class Safari implements NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO A PÁGINA");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO UMA NOVA ABA");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA");
	}

}
