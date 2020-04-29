#Author: Vinicius Souza
#language: pt
#encoding: UTF-8

Funcionalidade: Receber dados para cadastro do site 4devs e usar os mesmos para efetuar um cadastro com sucesso
	
	@pegar4dev
	Cenario: Acessar o site 4devs e pegar informacoes para usar no cadastro
		Dado que acesso o site da 4devs
		Quando clico no botao Gerar Pessoa
		Entao visualizo e armazeno dados validos aleatorios
		
  @startWeb
  Cenario: Validar sucesso ao cadastrar novo usuário no site Americanas
  	Dado que clico no hyperlink ola, faca seu login ou cadastre-se
  	E clico no hyperlink Cliente novo? Cadastrar
    Quando preencho todos os campos com dados validos
    E clico no botao criar seu cadastro
    Entao visualizo o texto "receba hoje"

    
