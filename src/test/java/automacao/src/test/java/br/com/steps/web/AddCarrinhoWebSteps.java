package automacao.src.test.java.br.com.steps.web;

import org.junit.Assert;

import br.com.automacao.web.funcionalidade.AddCarrinhoWebFuncionalidade;
import br.com.automacao.web.funcionalidade.LoginWebFuncionalidade;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class AddCarrinhoWebSteps {
	
	private AddCarrinhoWebFuncionalidade compraWebFuncionalidade;
	private LoginWebFuncionalidade loginWebFuncionalidade;
	
	public AddCarrinhoWebSteps() {
		this.compraWebFuncionalidade = new AddCarrinhoWebFuncionalidade();
		this.loginWebFuncionalidade = new LoginWebFuncionalidade();
	}
	
	@Dado("^que entro na pagina \"([^\"]*)\" do site$")
	public void queEstouNaPaginaDoSite(String arg1) {
		this.loginWebFuncionalidade.loginUsuarios();
		this.loginWebFuncionalidade.clicaBotaoLogin();
	}

	@E("^adiciono os itens \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\" ao carrinho$")
	public void adicionoOsItensEAoCarrinho(String arg1, String arg2, String arg3) {
		this.compraWebFuncionalidade.addCarrinho();
	}

	@Quando("^clico no botao Carrinho$")
	public void clicoNoBotaoCarrinho() throws InterruptedException {
		this.compraWebFuncionalidade.clickCarrinho();
	}

	@Entao("^visualizo os itens \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\" que adicionei no carrinho$")
	public void visualizoOsItensEQueAdicioneiNoCarrinho(String arg1, String arg2, String arg3) {
		arg1 = this.compraWebFuncionalidade.validaItensCarrinho(0);
		arg2 = this.compraWebFuncionalidade.validaItensCarrinho(1);
		arg3 = this.compraWebFuncionalidade.validaItensCarrinho(2);
		Assert.assertEquals("Sauce Labs Bolt T-Shirt", arg1);
		Assert.assertEquals("Sauce Labs Backpack", arg2);
		Assert.assertEquals("Sauce Labs Bike Light", arg3);
	}

}
