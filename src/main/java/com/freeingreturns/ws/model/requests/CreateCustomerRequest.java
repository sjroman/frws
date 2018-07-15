package com.freeingreturns.ws.model.requests;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreateCustomerRequest {
	@XmlElement(required=true)
	private String ID_CT;
	@XmlElement(required=true)
	private Integer ID_PRTY;
	private String NM_CT;
	private String ID_EM;
	private Integer STS_CT;
	private String ID_NCRPT_ACTN_CRD;
	private String ID_MSK_ACNT_CRD;
	private String LCL;
	private String ID_NCRPT_TAX;
	private String ID_HSH_TAX;
	private String ID_MASK_TAX;
	private Integer ID_PRCGP;
	private Integer ID_CT_BTCH;
	
	/**
	 * @return the iD_CT
	 */
	public String getID_CT() {
		return ID_CT;
	}
	/**
	 * @param iD_CT the iD_CT to set
	 */
	public void setID_CT(String iD_CT) {
		ID_CT = iD_CT;
	}
	/**
	 * @return the iD_PRTY
	 */
	public Integer getID_PRTY() {
		return ID_PRTY;
	}
	/**
	 * @param iD_PRTY the iD_PRTY to set
	 */
	public void setID_PRTY(Integer iD_PRTY) {
		ID_PRTY = iD_PRTY;
	}
	/**
	 * @return the nM_CT
	 */
	public String getNM_CT() {
		return NM_CT;
	}
	/**
	 * @param nM_CT the nM_CT to set
	 */
	public void setNM_CT(String nM_CT) {
		NM_CT = nM_CT;
	}
	/**
	 * @return the iD_EM
	 */
	public String getID_EM() {
		return ID_EM;
	}
	/**
	 * @param iD_EM the iD_EM to set
	 */
	public void setID_EM(String iD_EM) {
		ID_EM = iD_EM;
	}
	/**
	 * @return the sTS_CT
	 */
	public Integer getSTS_CT() {
		return STS_CT;
	}
	/**
	 * @param sTS_CT the sTS_CT to set
	 */
	public void setSTS_CT(Integer sTS_CT) {
		STS_CT = sTS_CT;
	}
	/**
	 * @return the iD_NCRPT_ACTN_CRD
	 */
	public String getID_NCRPT_ACTN_CRD() {
		return ID_NCRPT_ACTN_CRD;
	}
	/**
	 * @param iD_NCRPT_ACTN_CRD the iD_NCRPT_ACTN_CRD to set
	 */
	public void setID_NCRPT_ACTN_CRD(String iD_NCRPT_ACTN_CRD) {
		ID_NCRPT_ACTN_CRD = iD_NCRPT_ACTN_CRD;
	}
	/**
	 * @return the iD_MSK_ACNT_CRD
	 */
	public String getID_MSK_ACNT_CRD() {
		return ID_MSK_ACNT_CRD;
	}
	/**
	 * @param iD_MSK_ACNT_CRD the iD_MSK_ACNT_CRD to set
	 */
	public void setID_MSK_ACNT_CRD(String iD_MSK_ACNT_CRD) {
		ID_MSK_ACNT_CRD = iD_MSK_ACNT_CRD;
	}
	/**
	 * @return the lCL
	 */
	public String getLCL() {
		return LCL;
	}
	/**
	 * @param lCL the lCL to set
	 */
	public void setLCL(String lCL) {
		LCL = lCL;
	}
	/**
	 * @return the iD_NCRPT_TAX
	 */
	public String getID_NCRPT_TAX() {
		return ID_NCRPT_TAX;
	}
	/**
	 * @param iD_NCRPT_TAX the iD_NCRPT_TAX to set
	 */
	public void setID_NCRPT_TAX(String iD_NCRPT_TAX) {
		ID_NCRPT_TAX = iD_NCRPT_TAX;
	}
	/**
	 * @return the iD_HSH_TAX
	 */
	public String getID_HSH_TAX() {
		return ID_HSH_TAX;
	}
	/**
	 * @param iD_HSH_TAX the iD_HSH_TAX to set
	 */
	public void setID_HSH_TAX(String iD_HSH_TAX) {
		ID_HSH_TAX = iD_HSH_TAX;
	}
	/**
	 * @return the iD_MASK_TAX
	 */
	public String getID_MASK_TAX() {
		return ID_MASK_TAX;
	}
	/**
	 * @param iD_MASK_TAX the iD_MASK_TAX to set
	 */
	public void setID_MASK_TAX(String iD_MASK_TAX) {
		ID_MASK_TAX = iD_MASK_TAX;
	}
	/**
	 * @return the iD_PRCGP
	 */
	public Integer getID_PRCGP() {
		return ID_PRCGP;
	}
	/**
	 * @param iD_PRCGP the iD_PRCGP to set
	 */
	public void setID_PRCGP(Integer iD_PRCGP) {
		ID_PRCGP = iD_PRCGP;
	}
	/**
	 * @return the iD_CT_BTCH
	 */
	public Integer getID_CT_BTCH() {
		return ID_CT_BTCH;
	}
	/**
	 * @param iD_CT_BTCH the iD_CT_BTCH to set
	 */
	public void setID_CT_BTCH(Integer iD_CT_BTCH) {
		ID_CT_BTCH = iD_CT_BTCH;
	}
	
	
}
