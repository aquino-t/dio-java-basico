package funcionalidades.iphone;

import funcionalidades.aparelho_telefonico.AparelhoTelefonico;
import funcionalidades.navegador_internet.NavegadorInternet;
import funcionalidades.reprodutor_musical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("TOCANDO...");	
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO");	
	}

	@Override
	public void selecionarMusica() {
		System.out.println("MUSICA SELECIONADA");	
	}

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

	@Override
	public void ligar() {
		System.out.println("LIGANDO");
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}


}
