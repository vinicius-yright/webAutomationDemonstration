package br.com.automacao.web.funcionalidade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.CadastroWebPage;

public class CadastroWebFuncionalidade extends BaseTest{
	
	private CadastroWebPage cadastroWebPage;
	
	String nome, cpf, dataNasc, dataNascimento, email, tel, telefone, data ,telefoneNovo, dataNovo;
	String nomeNovo, cpfNovo, emailNovo;
	
	
	public CadastroWebFuncionalidade() {
        this.cadastroWebPage = new CadastroWebPage(webDriver);
    }
	
	public void clickGerarPessoa() {
		this.cadastroWebPage.getBtn4GerarPessoa().click();
	}
	
	public void armazenaDados() throws IOException {
		
		nome = this.cadastroWebPage.getBtn4Nome().getText();
		cpf = this.cadastroWebPage.getBtn4Cpf().getText();
		
		dataNasc = this.cadastroWebPage.getBtn4Data().getText();
		data = dataNasc.replaceAll("[^a-zA-Z0-9]", "");
		
		email = this.cadastroWebPage.getBtn4Email().getText();
		
		tel = this.cadastroWebPage.getBtn4Tel().getText();
		telefone = tel.replaceAll("[^a-zA-Z0-9]", "");
		
		BufferedWriter buff = new BufferedWriter(new FileWriter("dados.txt"));
		buff.write(nome);
		buff.newLine();
		buff.write(cpf);
		buff.newLine();
		buff.write(data);
		buff.newLine();
		buff.write(email);
		buff.newLine();
		buff.write(telefone);
		buff.newLine();
		
		buff.close();
	}
	

	
	
	
	public void clickOla() {
		this.cadastroWebPage.getInicioCadastro().click();
	}
	
	public void clickNovoCliente() {
		wait.until(ExpectedConditions.elementToBeClickable(this.cadastroWebPage.getBotaoIrCadastro()));
		this.cadastroWebPage.getBotaoIrCadastro().click();
	}
	
	public void preencheCampos() throws IOException, InterruptedException {
		int i = 2;
		
		
		FileInputStream test = new FileInputStream("dados.txt");
		Reader reader = new InputStreamReader(test, "UTF-8");
		BufferedReader buff = new BufferedReader(reader);
		
		String linha = buff.readLine();
		nomeNovo = linha;
		
		while (linha != null) {
			linha = buff.readLine();
			
			switch(i) {
				case 2:
					cpfNovo = linha;
				case 3:
					dataNovo = String.valueOf(linha);
				case 4:
					emailNovo = linha;
				case 5:
					telefoneNovo = String.valueOf(linha);
			}
			i++;
		}
		
		buff.close(); //fechando o fluxo do BufferedReader
		
		wait.until(ExpectedConditions.visibilityOf(this.cadastroWebPage.getCampoEmail()));
		this.cadastroWebPage.getCampoEmail().sendKeys(emailNovo);
		this.cadastroWebPage.getCampoSenha().sendKeys("senhapadrao94323");
		this.cadastroWebPage.getCampoCpf().sendKeys(cpfNovo);
		this.cadastroWebPage.getCampoNome().sendKeys(nomeNovo);
		this.cadastroWebPage.getCampoNascimento().sendKeys(dataNovo);
		this.cadastroWebPage.getOptionMasculino().click();
		this.cadastroWebPage.getCampoTel().sendKeys(telefoneNovo);
		
	}
	
	public void clickFinalizacaoCadastro() {
		this.cadastroWebPage.getBotaoFimCadastro().click();
	}
	
	public String validaCadastro() {
		return this.cadastroWebPage.getValSucesso().getText();
	}
	
	

}
