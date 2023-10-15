package funcionalidades.navegador_internet;

public class Email implements NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO A PÁGINA DE EMAIL");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO UMA NOVA ABA DO EMAIL");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA DE EMAIL");
	}

}
