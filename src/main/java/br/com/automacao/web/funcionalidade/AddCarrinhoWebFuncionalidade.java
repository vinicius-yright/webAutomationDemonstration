package br.com.automacao.web.funcionalidade;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.AddCarrinhoWebPage;

public class AddCarrinhoWebFuncionalidade extends BaseTest{
	
	private AddCarrinhoWebPage compraWebPage;

	public AddCarrinhoWebFuncionalidade() {
        this.compraWebPage = new AddCarrinhoWebPage(webDriver);
    }
	
	public void addCarrinho() {
		int three = 0;
		while (three < 3) {
			this.compraWebPage.getBotaoAddToCart().click();
			three++;
		}
	}
	
	public void clickCarrinho() {
		this.compraWebPage.getBotaoCarrinho().click();
	}
	
	public String validaItensCarrinho(int index) {
		String itens[]  = new String[3];
		itens[0] = this.compraWebPage.getCamisaCart().getText();
		itens[1] = this.compraWebPage.getMochilaCart().getText();
		itens[2] = this.compraWebPage.getMacacaoCart().getText();
			return itens[index];
	}
}
