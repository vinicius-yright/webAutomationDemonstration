package automacao.src.test.java.br.com.steps.web;

import org.junit.Assert;

import br.com.automacao.web.funcionalidade.AddCarrinhoWebFuncionalidade;
import br.com.automacao.web.funcionalidade.FinalCompraWebFuncionalidade;
import br.com.automacao.web.funcionalidade.LoginWebFuncionalidade;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class FinalCompraWebSteps {
	
	private FinalCompraWebFuncionalidade fCompraWebFuncionalidade;
	private LoginWebFuncionalidade loginWebFuncionalidade;
	private AddCarrinhoWebFuncionalidade addCarrinhoWebFuncionalidade;
	
	public FinalCompraWebSteps() {
		this.fCompraWebFuncionalidade = new FinalCompraWebFuncionalidade();
		this.loginWebFuncionalidade = new LoginWebFuncionalidade();
		this.addCarrinhoWebFuncionalidade = new AddCarrinhoWebFuncionalidade();
	}

	@Dado("^que estou na pagina \"([^\"]*)\"$")
	public void queEstouNaPagina(String arg1) {
		this.loginWebFuncionalidade.loginUsuarios();
		this.loginWebFuncionalidade.clicaBotaoLogin();
		this.addCarrinhoWebFuncionalidade.addCarrinho();
		this.addCarrinhoWebFuncionalidade.clickCarrinho();
	}
	
	@E("^clico no botao Checkout$")
	public void clicoNoBotaoCheckout() {
		this.fCompraWebFuncionalidade.clickCheckout();
	}

	@E("^preencho os campos com dados validos$")
	public void preenchoOsCamposComDadosVálidos()  {
		this.fCompraWebFuncionalidade.preencheDadosEntrega();
	}

	@E("^clico no botao \"([^\"]*)\"$")
	public void clicoNoBotaoContinue(String arg1) {
		this.fCompraWebFuncionalidade.clickContinue();
	}

	@Quando("^clico em finish$")
	public void clicoEmFinish() {
		this.fCompraWebFuncionalidade.clickFinish();
	}

	@Entao("^visualizo \"([^\"]*)\" no topo da tela$")
	public void visualizoNoTopoDaTela(String arg1) {
		Assert.assertEquals("THANK YOU FOR YOUR ORDER", this.fCompraWebFuncionalidade.validaDadosConfirma());
	}

}
