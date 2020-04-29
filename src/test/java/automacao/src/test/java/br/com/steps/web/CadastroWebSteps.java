package automacao.src.test.java.br.com.steps.web;

import java.io.IOException;

import org.junit.Assert;

import br.com.automacao.web.funcionalidade.CadastroWebFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroWebSteps {
	
	private CadastroWebFuncionalidade cadastroWebFuncionalidade;
	
	public CadastroWebSteps() {
		this.cadastroWebFuncionalidade = new CadastroWebFuncionalidade();
	}
	
	//PARTE DE RECEBER OS DADOS DA 4DEV
	
		@Dado("^que acesso o site da (\\d+)devs$")
		public void queAcessoOSiteDaDevs(int arg1) {
			System.out.println("Acessando o site");
		}

		@Quando("^clico no botao Gerar Pessoa$")
		public void clicoNoBotaoGerarPessoa() throws InterruptedException {
			Thread.sleep(2000);
			this.cadastroWebFuncionalidade.clickGerarPessoa();
		}

		@Entao("^visualizo e armazeno dados validos aleatorios$")
		public void visualizoEArmazenoDadosValidosAleatorios() throws InterruptedException, IOException{
			Thread.sleep(2000);
			this.cadastroWebFuncionalidade.armazenaDados();
		}
		
	//FIM DA PARTE DE RECEBER OS DADOS DA 4DEV	
	
	@Dado("^que clico no hyperlink ola, faca seu login ou cadastre-se$")
	public void queClicoNoHyperlinkOlaFacaSeuLoginOuCadastrese() {
		this.cadastroWebFuncionalidade.clickOla();
	}

	@E("^clico no hyperlink Cliente novo\\? Cadastrar$")
	public void clicoNoHyperlinkClienteNovoCadastrar() {
		this.cadastroWebFuncionalidade.clickNovoCliente();
	}
	
	@Quando("^preencho todos os campos com dados validos$")
	public void preenchoTodosOsCamposComDadosValidos() throws IOException, InterruptedException {
		this.cadastroWebFuncionalidade.preencheCampos();
	}

	@E("^clico no botao criar seu cadastro$")
	public void clicoNoBotaoCriarSeuCadastro() throws InterruptedException  {
		Thread.sleep(1500);
		this.cadastroWebFuncionalidade.clickFinalizacaoCadastro();
		Thread.sleep(1500);
	}

	@Entao("^visualizo o texto \"([^\"]*)\"$")
	public void visualizoOTexto(String arg1) {
		Assert.assertEquals("receba hoje", this.cadastroWebFuncionalidade.validaCadastro());
	}

	
}
