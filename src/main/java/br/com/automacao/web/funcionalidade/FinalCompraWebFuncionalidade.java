package br.com.automacao.web.funcionalidade;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.FinalCompraWebPage;

public class FinalCompraWebFuncionalidade extends BaseTest {
	
	private FinalCompraWebPage finalCompraWebPage;
	
	public FinalCompraWebFuncionalidade() {
		this.finalCompraWebPage = new FinalCompraWebPage(webDriver);
	}
	
	public void clickCheckout() {
		this.finalCompraWebPage.getBotaoCheckout().click();
	}
	
	public void clickContinue() {
		this.finalCompraWebPage.getBtnContinue().click();
	}
	
	public void clickFinish() {
		this.finalCompraWebPage.getBtnFinaliza().click();
	}
	
	public void preencheDadosEntrega() {
		this.finalCompraWebPage.getPriNomeCampo().sendKeys("Zezinho");
		this.finalCompraWebPage.getUltNomeCampo().sendKeys("Pherreira");
		this.finalCompraWebPage.getCepCampo().sendKeys("67432897");
	}
	
	public String validaDadosConfirma() {
		String valida = this.finalCompraWebPage.getTxtConfirmacao().getText();
		return valida;
	}
	
}
