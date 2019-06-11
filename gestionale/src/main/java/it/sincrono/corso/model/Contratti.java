package it.sincrono.corso.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contratti")

public class Contratti {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id_Contratto;
	
	@Column(name="tipo_Contratto")
	private String contratto;
	
	@Column(name="inizio_Contratto")
	private Date inizioContratto;
	
	@Column(name="fine_Contratto")
	private Date fineContratto;

	public String getId_Contratto() {
		return id_Contratto;
	}

	public void setId_Contratto(String id_Contratto) {
		this.id_Contratto = id_Contratto;
	}

	public String getContratto() {
		return contratto;
	}

	public void setContratto(String contratto) {
		this.contratto = contratto;
	}

	public Date getInizioContratto() {
		return inizioContratto;
	}

	public void setInizioContratto(Date inizioContratto) {
		this.inizioContratto = inizioContratto;
	}

	public Date getFineContratto() {
		return fineContratto;
	}

	public void setFineContratto(Date fineContratto) {
		this.fineContratto = fineContratto;
	}

	public Contratti() {
		super();
	}

	public Contratti(String id_Contratto, String contratto, Date inizioContratto, Date fineContratto) {
		super();
		this.id_Contratto = id_Contratto;
		this.contratto = contratto;
		this.inizioContratto = inizioContratto;
		this.fineContratto = fineContratto;
	}



	








}
