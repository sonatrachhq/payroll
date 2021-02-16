package com.sonatrach.dz.etatMip.domain;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name ="PAIE_ETAT_MIP")
@NamedQuery(name = "EtatMip.findByPayMonth", query = "SELECT p FROM EtatMip  p WHERE moisexp=?1 AND anneeexp=?2 order by dirdes")
public class EtatMip {
	@Id
	@Column(name="BUL_MATRICULE")
	String bulmatricule;
	@Column(name="MOIS_EXP")
	String moisexp;
	@Column(name="ANNEE_EXP")
	String anneeexp;
	@Column(name="DIR")
	String dir;
	@Column(name="DIV_OP")
	String divop;
	@Column(name="BUL_MOIS_PAIE")
	Date bulmoispaie;
	@Column(name="AGT_NOM")
	String agtnom;
	@Column(name="DATE_EFFET")
	String dateeffet;
	@Column(name="MONTANT_460")
	BigDecimal montant460;
	@Column(name="RAPP_460")
	BigDecimal rapp460;
	@Column(name="DIV_DESIGNATION")
	String divdes;
	@Column(name="DIR_DESIGNATION")
	String dirdes;
	
	public EtatMip() {
		
	}

	public String getBulmatricule() {
		return bulmatricule;
	}

	public void setBulmatricule(String bulmatricule) {
		this.bulmatricule = bulmatricule;
	}

	public String getMoisexp() {
		return moisexp;
	}

	public void setMoisexp(String moisexp) {
		this.moisexp = moisexp;
	}

	public String getAnneeexp() {
		return anneeexp;
	}

	public void setAnneeexp(String anneeexp) {
		this.anneeexp = anneeexp;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getDivop() {
		return divop;
	}

	public void setDivop(String divop) {
		this.divop = divop;
	}

	public Date getBulmoispaie() {
		return bulmoispaie;
	}

	public void setBulmoispaie(Date bulmoispaie) {
		this.bulmoispaie = bulmoispaie;
	}

	public String getAgtnom() {
		return agtnom;
	}

	public void setAgtnom(String agtnom) {
		this.agtnom = agtnom;
	}

	public String getDateeffet() {
		return dateeffet;
	}

	public void setDateeffet(String dateeffet) {
		this.dateeffet = dateeffet;
	}

	public BigDecimal getMontant460() {
		return montant460;
	}

	public void setMontant460(BigDecimal montant460) {
		this.montant460 = montant460;
	}

	public BigDecimal getRapp460() {
		return rapp460;
	}

	public void setRapp460(BigDecimal rapp460) {
		this.rapp460 = rapp460;
	}

	public String getDivdes() {
		return divdes;
	}

	public void setDivdes(String divdes) {
		this.divdes = divdes;
	}

	public String getDirdes() {
		return dirdes;
	}

	public void setDirdes(String dirdes) {
		this.dirdes = dirdes;
	}



	
	
}
