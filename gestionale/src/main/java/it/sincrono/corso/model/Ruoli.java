package it.sincrono.corso.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ruoli")

public class Ruoli {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int idRuoli;
	
	
	public Ruoli() {
		super();
	}

	public Ruoli(int idRuoli, String inquadramaneto, String livello, Date inizioRuolo, Date fineRuolo) {
		super();
		this.idRuoli = idRuoli;
		this.inquadramaneto = inquadramaneto;
		this.livello = livello;
		this.inizioRuolo = inizioRuolo;
		this.fineRuolo = fineRuolo;
	}

	public int getIdRuoli() {
		return idRuoli;
	}

	public void setIdRuoli(int idRuoli) {
		this.idRuoli = idRuoli;
	}

	public String getInquadramaneto() {
		return inquadramaneto;
	}

	public void setInquadramaneto(String inquadramaneto) {
		this.inquadramaneto = inquadramaneto;
	}

	public String getLivello() {
		return livello;
	}

	public void setLivello(String livello) {
		this.livello = livello;
	}

	public Date getInizioRuolo() {
		return inizioRuolo;
	}

	public void setInizioRuolo(Date inizioRuolo) {
		this.inizioRuolo = inizioRuolo;
	}

	public Date getFineRuolo() {
		return fineRuolo;
	}

	public void setFineRuolo(Date fineRuolo) {
		this.fineRuolo = fineRuolo;
	}

	@Column(name="inquadramento")
	private String inquadramaneto;

	@Column(name="livello")
	private String livello;

	@Column(name="inizio_ruolo")
	private Date inizioRuolo;
	
	@Column(name="fine_ruolo")
	private Date fineRuolo;

}
