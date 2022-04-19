package aula.classes.objetos;

public class Pessoa {
	String nome;
	String cpf;
	String endereco;
	String bairro;
	
Pessoa (String nome, String cpf, String endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.bairro = bairro;
	}

Pessoa (String nome, String cpf){
	this(nome, cpf, "NÃO INFORMADO");
}

Pessoa (){
	
}

}
