#Author: Vinicius Souza
#language: pt
#encoding: UTF-8

#teste
Funcionalidade: Efetuar compra de multiplos produtos com sucesso

  @compraTeste
  Cenario: Adicionando tres produtos ao carrinho
    Dado que entro na pagina "Products" do site
    E adiciono os itens "Sauce Labs Backpack", "Sauce Labs Bolt T-shirt" e "Sauce Labs Onesie" ao carrinho
    Quando clico no botao Carrinho
    Entao visualizo os itens "Sauce Labs Backpack", "Sauce Labs Bolt T-Shirt" e "Sauce Labs Bike Light" que adicionei no carrinho

  @finalCompraTeste
  Cenario: Finalizando a compra
    Dado que estou na pagina "Your cart"
    E clico no botao Checkout
    E preencho os campos com dados validos
    E clico no botao "Continue"
    Quando clico em finish
    Entao visualizo "THANK YOU FOR YOUR ORDER" no topo da tela
