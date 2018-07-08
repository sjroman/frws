package com.freeingreturns.ws.model.dto;

import java.io.Serializable;
import java.sql.Timestamp;

//object to be used to get data from and put data into AS_ITM table
public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6163917910440502676L;
	//primary key
	//required
	private String ID_ITM; //ItemID
	private String ID_ITM_PDT; //ItemProductId
	private String ID_DPT_POS; //POSDepartmentId
	private String NM_ITM; //ItemName
	private String DE_ITM; //ItemDescription
	private String NM_BRN; //BrandName
	private String LU_SN; //SeasonCode
	private String FY; //FiscalYear
	private Integer ID_GP_TX = 0; //TaxGroupId
	private String ID_STRC_MR_CD0; //MerchandiseClassificationCode0
	private String ID_STRC_MR_CD1; //MerchandiseClassificationCode1
	private String ID_STRC_MR_CD2; //MerchandiseClassificationCode2
	private String ID_STRC_MR_CD3; //MerchandiseClassificationCode3
	private String ID_MRHRC_GP = "0"; //MerchandiseHierarchyGroupId
	private Integer ID_MF; //ManufacturerId
	private Timestamp TS_CRT_RCRD; //RecordCreationTimestamp
	private Timestamp TS_MDF_RCRD = new Timestamp(System.currentTimeMillis()); //RecordLastModifiedTimestamp
	
	/**
	 * @return the iD_ITM
	 */
	public String getID_ITM() {
		return ID_ITM;
	}
	/**
	 * @param iD_ITM the iD_ITM to set
	 */
	public void setID_ITM(String iD_ITM) {
		ID_ITM = iD_ITM;
	}
	/**
	 * @return the iD_ITM_PDT
	 */
	public String getID_ITM_PDT() {
		return ID_ITM_PDT;
	}
	/**
	 * @param iD_ITM_PDT the iD_ITM_PDT to set
	 */
	public void setID_ITM_PDT(String iD_ITM_PDT) {
		ID_ITM_PDT = iD_ITM_PDT;
	}
	/**
	 * @return the iD_DPT_POS
	 */
	public String getID_DPT_POS() {
		return ID_DPT_POS;
	}
	/**
	 * @param iD_DPT_POS the iD_DPT_POS to set
	 */
	public void setID_DPT_POS(String iD_DPT_POS) {
		ID_DPT_POS = iD_DPT_POS;
	}
	/**
	 * @return the nM_ITM
	 */
	public String getNM_ITM() {
		return NM_ITM;
	}
	/**
	 * @param nM_ITM the nM_ITM to set
	 */
	public void setNM_ITM(String nM_ITM) {
		NM_ITM = nM_ITM;
	}
	/**
	 * @return the dE_ITM
	 */
	public String getDE_ITM() {
		return DE_ITM;
	}
	/**
	 * @param dE_ITM the dE_ITM to set
	 */
	public void setDE_ITM(String dE_ITM) {
		DE_ITM = dE_ITM;
	}
	/**
	 * @return the nM_BRN
	 */
	public String getNM_BRN() {
		return NM_BRN;
	}
	/**
	 * @param nM_BRN the nM_BRN to set
	 */
	public void setNM_BRN(String nM_BRN) {
		NM_BRN = nM_BRN;
	}
	/**
	 * @return the lU_SN
	 */
	public String getLU_SN() {
		return LU_SN;
	}
	/**
	 * @param lU_SN the lU_SN to set
	 */
	public void setLU_SN(String lU_SN) {
		LU_SN = lU_SN;
	}
	/**
	 * @return the fY
	 */
	public String getFY() {
		return FY;
	}
	/**
	 * @param fY the fY to set
	 */
	public void setFY(String fY) {
		FY = fY;
	}
	/**
	 * @return the iD_GP_TX
	 */
	public Integer getID_GP_TX() {
		return ID_GP_TX;
	}
	/**
	 * @param iD_GP_TX the iD_GP_TX to set
	 */
	public void setID_GP_TX(Integer iD_GP_TX) {
		ID_GP_TX = iD_GP_TX;
	}
	/**
	 * @return the iD_STRC_MR_CD0
	 */
	public String getID_STRC_MR_CD0() {
		return ID_STRC_MR_CD0;
	}
	/**
	 * @param iD_STRC_MR_CD0 the iD_STRC_MR_CD0 to set
	 */
	public void setID_STRC_MR_CD0(String iD_STRC_MR_CD0) {
		ID_STRC_MR_CD0 = iD_STRC_MR_CD0;
	}
	/**
	 * @return the iD_STRC_MR_CD1
	 */
	public String getID_STRC_MR_CD1() {
		return ID_STRC_MR_CD1;
	}
	/**
	 * @param iD_STRC_MR_CD1 the iD_STRC_MR_CD1 to set
	 */
	public void setID_STRC_MR_CD1(String iD_STRC_MR_CD1) {
		ID_STRC_MR_CD1 = iD_STRC_MR_CD1;
	}
	/**
	 * @return the iD_STRC_MR_CD2
	 */
	public String getID_STRC_MR_CD2() {
		return ID_STRC_MR_CD2;
	}
	/**
	 * @param iD_STRC_MR_CD2 the iD_STRC_MR_CD2 to set
	 */
	public void setID_STRC_MR_CD2(String iD_STRC_MR_CD2) {
		ID_STRC_MR_CD2 = iD_STRC_MR_CD2;
	}
	/**
	 * @return the iD_STRC_MR_CD3
	 */
	public String getID_STRC_MR_CD3() {
		return ID_STRC_MR_CD3;
	}
	/**
	 * @param iD_STRC_MR_CD3 the iD_STRC_MR_CD3 to set
	 */
	public void setID_STRC_MR_CD3(String iD_STRC_MR_CD3) {
		ID_STRC_MR_CD3 = iD_STRC_MR_CD3;
	}
	/**
	 * @return the iD_MRHRC_GP
	 */
	public String getID_MRHRC_GP() {
		return ID_MRHRC_GP;
	}
	/**
	 * @param iD_MRHRC_GP the iD_MRHRC_GP to set
	 */
	public void setID_MRHRC_GP(String iD_MRHRC_GP) {
		ID_MRHRC_GP = iD_MRHRC_GP;
	}
	/**
	 * @return the iD_MF
	 */
	public Integer getID_MF() {
		return ID_MF;
	}
	/**
	 * @param iD_MF the iD_MF to set
	 */
	public void setID_MF(Integer iD_MF) {
		ID_MF = iD_MF;
	}
	/**
	 * @return the tS_CRT_RCRD
	 */
	public Timestamp getTS_CRT_RCRD() {
		return TS_CRT_RCRD;
	}
	/**
	 * @param tS_CRT_RCRD the tS_CRT_RCRD to set
	 */
	public void setTS_CRT_RCRD(Timestamp tS_CRT_RCRD) {
		TS_CRT_RCRD = tS_CRT_RCRD;
	}
	/**
	 * @return the tS_MDF_RCRD
	 */
	public Timestamp getTS_MDF_RCRD() {
		return TS_MDF_RCRD;
	}
	/**
	 * @param tS_MDF_RCRD the tS_MDF_RCRD to set
	 */
	public void setTS_MDF_RCRD(Timestamp tS_MDF_RCRD) {
		TS_MDF_RCRD = tS_MDF_RCRD;
	}
}
