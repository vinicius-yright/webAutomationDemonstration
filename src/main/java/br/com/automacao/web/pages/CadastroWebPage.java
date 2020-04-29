package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroWebPage {
			
	public CadastroWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
	
//IDS DA 4DEV	
	@FindBy(id = "bt_gerar_pessoa")
	private WebElement btn4GerarPessoa;
	
	@FindBy(id = "nome")
	private WebElement btn4Nome;
	
	@FindBy(id = "cpf")
	private WebElement btn4Cpf;
	
	@FindBy(id = "data_nasc")
	private WebElement btn4Data;
	
	@FindBy(id = "email")
	private WebElement btn4Email;
	
	@FindBy(id = "telefone_fixo")
	private WebElement btn4Tel;
//FIM DOS IDS DA 4DEV	
	
	
//XPATHS AMERICANAS	
	@FindBy(xpath = "//div[contains(text(), 'olá, faça seu login')]")
	private WebElement inicioCadastro;
	
	@FindBy(xpath = "//a[contains(text(), 'Cliente novo? Cadastrar')]")
	private WebElement botaoIrCadastro;
	
	@FindBy(xpath = "//input[@id='email-input']")
	private WebElement campoEmail;
	
	@FindBy(xpath = "//input[@id='password-input']")
	private WebElement campoSenha;
	
	@FindBy(xpath = "//input[@id='cpf-input']")
	private WebElement campoCpf;
	
	@FindBy(xpath = "//input[@id='name-input']")
	private WebElement campoNome;
	
	@FindBy(xpath = "//input[@id='birthday-input']")
	private WebElement campoNascimento;
	
	@FindBy(xpath = "//label[contains(text(), 'Masculino')]")
	private WebElement optionMasculino;
	
	@FindBy(xpath = "//input[@id='phone-input']")
	private WebElement campoTel;
	
	@FindBy(xpath = "//button[contains(text(), 'Criar seu cadastro')]")
	private WebElement botaoFimCadastro;
	
	@FindBy(xpath = "//a[@title='receba hoje']")
	private WebElement valSucesso;

	public WebElement getBtn4GerarPessoa() {
		return btn4GerarPessoa;
	}

	public WebElement getBtn4Nome() {
		return btn4Nome;
	}

	public WebElement getBtn4Cpf() {
		return btn4Cpf;
	}

	public WebElement getBtn4Data() {
		return btn4Data;
	}

	public WebElement getBtn4Email() {
		return btn4Email;
	}

	public WebElement getBtn4Tel() {
		return btn4Tel;
	}

	public WebElement getInicioCadastro() {
		return inicioCadastro;
	}

	public WebElement getBotaoIrCadastro() {
		return botaoIrCadastro;
	}

	public WebElement getCampoEmail() {
		return campoEmail;
	}

	public WebElement getCampoSenha() {
		return campoSenha;
	}

	public WebElement getCampoCpf() {
		return campoCpf;
	}

	public WebElement getCampoNome() {
		return campoNome;
	}

	public WebElement getCampoNascimento() {
		return campoNascimento;
	}

	public WebElement getOptionMasculino() {
		return optionMasculino;
	}

	public WebElement getCampoTel() {
		return campoTel;
	}

	public WebElement getBotaoFimCadastro() {
		return botaoFimCadastro;
	}

	public WebElement getValSucesso() {
		return valSucesso;
	}

	
	
	
}
