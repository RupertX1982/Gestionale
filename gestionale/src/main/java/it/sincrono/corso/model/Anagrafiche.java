package it.sincrono.corso.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Anagrafiche {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idAnagrafico;
	
	
	public String getIdAnagrafico() {
		return idAnagrafico;
	}


	public void setIdAnagrafico(String idAnagrafico) {
		this.idAnagrafico = idAnagrafico;
	}


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


	public char getSesso() {
		return sesso;
	}


	public void setSesso(char sesso) {
		this.sesso = sesso;
	}


	public Date getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}


	@Column(name="nome")
	private String nome;
	
	
	
	@Column(name="cognome")
	private String cognome;
	

	@Column(name="sesso")
	private char sesso;
	
	
	@Column(name="data_nascita")
	private Date dataNascita;
	

	
	
	
	
	
	
	
}
