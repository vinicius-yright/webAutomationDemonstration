package automacao.src.test.java.br.com.steps.web;

import org.junit.Assert;


import br.com.automacao.web.funcionalidade.LoginWebFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class LoginWebSteps {
	
	private LoginWebFuncionalidade loginWebFuncionalidade;
	
	public LoginWebSteps() {
		this.loginWebFuncionalidade = new LoginWebFuncionalidade();
	}
	
	@Dado("^que insiro dados validos nos campos username e senha$")
	public void queInsiroDadosValidosNosCamposUsernameESenha()  {
		this.loginWebFuncionalidade.loginUsuarios();
	}
	@E("^eu clico no botao LOGIN$")
	public void euClicoNoBotaoLOGIN() {
		this.loginWebFuncionalidade.clicaBotaoLogin();
	}

	@Entao("^espero visualizar os \"([^\"]*)\"$")
	public void esperoVisualizarOs(String mensagemProducts){
		Assert.assertEquals("Products", this.loginWebFuncionalidade.verificaPagHome());
	}

	
}
