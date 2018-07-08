package com.freeingreturns.ws.model.dto;

import java.io.Serializable;
import java.sql.Timestamp;

//object to be used to get data from and put data into TR_RTL table
public class RetailTransaction implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6145338212815547206L;
	//primary key is (ID_STR_RT, ID_WS, DC_DY_BSN, AI_TRN)
	//required
	private String ID_STR_RT; //RetailStoreId
	//required
	private String ID_WS; //WorkstationId
	//required
	private String DB_DY_BSN; //BusinessDay
	//required
	private Integer AI_TRN; //TransactionSequenceNumber
	private String ID_CT; //CustomerId
	private String ID_REGISTRIY; //GiftRegistryId
	private String ID_LY; //LayawayId
	private Double MO_SLS_TOT = 0.0; //TransactionSalesTotal
	private Double MO_DSC_TOT = 0.0; //TransactionDiscountTotal
	private Double MO_TAX_TOT = 0.0; //TransactionTaxTotal
	private Double MO_NT_TOT = 0.0; //TransactionNetTotal
	private Double MO_TND_TOT = 0.0; //TransactionTenderTotal
	private String ID_EM; //EmployeeId
	private Timestamp TS_CRT_RCRD; //RecordCreationTimestamp
	private Timestamp TS_MDF_RCRD; //RecordLastModifiedTimestamp
	/**
	 * @return the iD_STR_RT
	 */
	public String getID_STR_RT() {
		return ID_STR_RT;
	}
	/**
	 * @param iD_STR_RT the iD_STR_RT to set
	 */
	public void setID_STR_RT(String iD_STR_RT) {
		ID_STR_RT = iD_STR_RT;
	}
	/**
	 * @return the iD_WS
	 */
	public String getID_WS() {
		return ID_WS;
	}
	/**
	 * @param iD_WS the iD_WS to set
	 */
	public void setID_WS(String iD_WS) {
		ID_WS = iD_WS;
	}
	/**
	 * @return the dB_DY_BSN
	 */
	public String getDB_DY_BSN() {
		return DB_DY_BSN;
	}
	/**
	 * @param dB_DY_BSN the dB_DY_BSN to set
	 */
	public void setDB_DY_BSN(String dB_DY_BSN) {
		DB_DY_BSN = dB_DY_BSN;
	}
	/**
	 * @return the aI_TRN
	 */
	public Integer getAI_TRN() {
		return AI_TRN;
	}
	/**
	 * @param aI_TRN the aI_TRN to set
	 */
	public void setAI_TRN(Integer aI_TRN) {
		AI_TRN = aI_TRN;
	}
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
	 * @return the iD_REGISTRIY
	 */
	public String getID_REGISTRIY() {
		return ID_REGISTRIY;
	}
	/**
	 * @param iD_REGISTRIY the iD_REGISTRIY to set
	 */
	public void setID_REGISTRIY(String iD_REGISTRIY) {
		ID_REGISTRIY = iD_REGISTRIY;
	}
	/**
	 * @return the iD_LY
	 */
	public String getID_LY() {
		return ID_LY;
	}
	/**
	 * @param iD_LY the iD_LY to set
	 */
	public void setID_LY(String iD_LY) {
		ID_LY = iD_LY;
	}
	/**
	 * @return the mO_SLS_TOT
	 */
	public Double getMO_SLS_TOT() {
		return MO_SLS_TOT;
	}
	/**
	 * @param mO_SLS_TOT the mO_SLS_TOT to set
	 */
	public void setMO_SLS_TOT(Double mO_SLS_TOT) {
		MO_SLS_TOT = mO_SLS_TOT;
	}
	/**
	 * @return the mO_DSC_TOT
	 */
	public Double getMO_DSC_TOT() {
		return MO_DSC_TOT;
	}
	/**
	 * @param mO_DSC_TOT the mO_DSC_TOT to set
	 */
	public void setMO_DSC_TOT(Double mO_DSC_TOT) {
		MO_DSC_TOT = mO_DSC_TOT;
	}
	/**
	 * @return the mO_TAX_TOT
	 */
	public Double getMO_TAX_TOT() {
		return MO_TAX_TOT;
	}
	/**
	 * @param mO_TAX_TOT the mO_TAX_TOT to set
	 */
	public void setMO_TAX_TOT(Double mO_TAX_TOT) {
		MO_TAX_TOT = mO_TAX_TOT;
	}
	/**
	 * @return the mO_NT_TOT
	 */
	public Double getMO_NT_TOT() {
		return MO_NT_TOT;
	}
	/**
	 * @param mO_NT_TOT the mO_NT_TOT to set
	 */
	public void setMO_NT_TOT(Double mO_NT_TOT) {
		MO_NT_TOT = mO_NT_TOT;
	}
	/**
	 * @return the mO_TND_TOT
	 */
	public Double getMO_TND_TOT() {
		return MO_TND_TOT;
	}
	/**
	 * @param mO_TND_TOT the mO_TND_TOT to set
	 */
	public void setMO_TND_TOT(Double mO_TND_TOT) {
		MO_TND_TOT = mO_TND_TOT;
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
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
