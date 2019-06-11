package it.sincrono.corso.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Anagrafiche")
public class Anagrafiche {

	public Anagrafiche() {
		super();
	}


	public Anagrafiche(String idAnagrafico, String luogoDiNascita, String residenza, String nome, String cognome,
			char sesso, Date dataNascita) {
		super();
		this.idAnagrafico = idAnagrafico;
		this.luogoDiNascita = luogoDiNascita;
		this.residenza = residenza;
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.dataNascita = dataNascita;
	}

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
	
	@Column(name="luogoDiNascita")
	private String luogoDiNascita;
	
	@Column(name="residenza")
	private String residenza;

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}


	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}


	public String getResidenza() {
		return residenza;
	}


	public void setResidenza(String residenza) {
		this.residenza = residenza;
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
