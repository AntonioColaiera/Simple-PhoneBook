package online.provajava.phonebook.model;

public class Contact {
 String nome, cognome,numero;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
	
	
}

public Contact(String nome, String cognome, String numero) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.numero = numero;
}

public Contact() {
	super();
} 
  
}
