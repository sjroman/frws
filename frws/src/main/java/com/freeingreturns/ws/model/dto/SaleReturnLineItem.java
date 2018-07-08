package com.freeingreturns.ws.model.dto;

import java.io.Serializable;
import java.sql.Timestamp;

//object to be used to get data from and put data into TR_LTM_SLS_RTN table
public class SaleReturnLineItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5658118166445534977L;
	//primary key is (ID_STR_RT, ID_WS, DC_DY_BSN, AI_TRN, AI_LN_ITM)
	//required
	private String ID_STR_RT; //RetailStoreId
	//required
	private String ID_WS; //WorkstationId
	//required
	private String DC_DY_BSN; //BusinessDay
	//required
	private Integer AI_TRN; //TransactionSequenceNumber
	//required
	private Integer AI_LN_ITM; //RetailTransactionLineItemSequenceNumber
	private String ID_REGISTRY; //GiftRegistryId
	private Integer ID_GP_TX = 0; //TaxGroupId
	private String ID_DPT_POS; //POSDepartmentId
	private String ID_ITM_POS; //POSItemId
	private String ID_ITM; //ItemId
	private Double QU_ITM_LM_RTN_SLS = new Double(0); //SaleReturnLineItemQuantity
	private Double MO_EXTN_LN_ITM_RTN = new Double(0); //SaleReturnLineItemExtendedAmount
	private Double MO_EXTN_DSC_LN_ITM = new Double(0); //SaleReturnLineItemExtendedDiscountedAmount
	private Double MO_FE_RSTK; //SaleReturnLineItemRestockingFeeAmount
	private char FL_RTN_MR = '0'; //MerchandiseReturnFlag
	private String RC_RTN_MR; //MerchandiseReturnReasonCode
	private Double QU_ITM_LN_RTN = new Double(0); //SaleReturnLineItemReturnQuantity
	private String ID_TRN_ORG; //POSOriginalTransactionid
	private String DC_DY_BSN_ORG; //OriginalBusinessDay
	private Integer AI_LN_ITM_ORG = -1; //OriginalRetailTransactionLineItemSequenceNumber
	private String ID_STR_RT_ORG; //OriginalRetailStoreId
	private Integer ID_SHP_MTH; //ShippingMethodId
	private String SPL_INSTRC; //SpecialInstruction
	private String ADS_SHP; //ShippingAddress
	private Timestamp TS_CRT_RCRD; //RecordCreatedTimestamp
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
	 * @return the dC_DY_BSN
	 */
	public String getDC_DY_BSN() {
		return DC_DY_BSN;
	}
	/**
	 * @param dC_DY_BSN the dC_DY_BSN to set
	 */
	public void setDC_DY_BSN(String dC_DY_BSN) {
		DC_DY_BSN = dC_DY_BSN;
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
	 * @return the aI_LN_ITM
	 */
	public Integer getAI_LN_ITM() {
		return AI_LN_ITM;
	}
	/**
	 * @param aI_LN_ITM the aI_LN_ITM to set
	 */
	public void setAI_LN_ITM(Integer aI_LN_ITM) {
		AI_LN_ITM = aI_LN_ITM;
	}
	/**
	 * @return the iD_REGISTRY
	 */
	public String getID_REGISTRY() {
		return ID_REGISTRY;
	}
	/**
	 * @param iD_REGISTRY the iD_REGISTRY to set
	 */
	public void setID_REGISTRY(String iD_REGISTRY) {
		ID_REGISTRY = iD_REGISTRY;
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
	 * @return the iD_ITM_POS
	 */
	public String getID_ITM_POS() {
		return ID_ITM_POS;
	}
	/**
	 * @param iD_ITM_POS the iD_ITM_POS to set
	 */
	public void setID_ITM_POS(String iD_ITM_POS) {
		ID_ITM_POS = iD_ITM_POS;
	}
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
	 * @return the qU_ITM_LM_RTN_SLS
	 */
	public Double getQU_ITM_LM_RTN_SLS() {
		return QU_ITM_LM_RTN_SLS;
	}
	/**
	 * @param qU_ITM_LM_RTN_SLS the qU_ITM_LM_RTN_SLS to set
	 */
	public void setQU_ITM_LM_RTN_SLS(Double qU_ITM_LM_RTN_SLS) {
		QU_ITM_LM_RTN_SLS = qU_ITM_LM_RTN_SLS;
	}
	/**
	 * @return the mO_EXTN_LN_ITM_RTN
	 */
	public Double getMO_EXTN_LN_ITM_RTN() {
		return MO_EXTN_LN_ITM_RTN;
	}
	/**
	 * @param mO_EXTN_LN_ITM_RTN the mO_EXTN_LN_ITM_RTN to set
	 */
	public void setMO_EXTN_LN_ITM_RTN(Double mO_EXTN_LN_ITM_RTN) {
		MO_EXTN_LN_ITM_RTN = mO_EXTN_LN_ITM_RTN;
	}
	/**
	 * @return the mO_EXTN_DSC_LN_ITM
	 */
	public Double getMO_EXTN_DSC_LN_ITM() {
		return MO_EXTN_DSC_LN_ITM;
	}
	/**
	 * @param mO_EXTN_DSC_LN_ITM the mO_EXTN_DSC_LN_ITM to set
	 */
	public void setMO_EXTN_DSC_LN_ITM(Double mO_EXTN_DSC_LN_ITM) {
		MO_EXTN_DSC_LN_ITM = mO_EXTN_DSC_LN_ITM;
	}
	/**
	 * @return the mO_FE_RSTK
	 */
	public Double getMO_FE_RSTK() {
		return MO_FE_RSTK;
	}
	/**
	 * @param mO_FE_RSTK the mO_FE_RSTK to set
	 */
	public void setMO_FE_RSTK(Double mO_FE_RSTK) {
		MO_FE_RSTK = mO_FE_RSTK;
	}
	/**
	 * @return the fL_RTN_MR
	 */
	public char getFL_RTN_MR() {
		return FL_RTN_MR;
	}
	/**
	 * @param fL_RTN_MR the fL_RTN_MR to set
	 */
	public void setFL_RTN_MR(char fL_RTN_MR) {
		FL_RTN_MR = fL_RTN_MR;
	}
	/**
	 * @return the rC_RTN_MR
	 */
	public String getRC_RTN_MR() {
		return RC_RTN_MR;
	}
	/**
	 * @param rC_RTN_MR the rC_RTN_MR to set
	 */
	public void setRC_RTN_MR(String rC_RTN_MR) {
		RC_RTN_MR = rC_RTN_MR;
	}
	/**
	 * @return the qU_ITM_LN_RTN
	 */
	public Double getQU_ITM_LN_RTN() {
		return QU_ITM_LN_RTN;
	}
	/**
	 * @param qU_ITM_LN_RTN the qU_ITM_LN_RTN to set
	 */
	public void setQU_ITM_LN_RTN(Double qU_ITM_LN_RTN) {
		QU_ITM_LN_RTN = qU_ITM_LN_RTN;
	}
	/**
	 * @return the iD_TRN_ORG
	 */
	public String getID_TRN_ORG() {
		return ID_TRN_ORG;
	}
	/**
	 * @param iD_TRN_ORG the iD_TRN_ORG to set
	 */
	public void setID_TRN_ORG(String iD_TRN_ORG) {
		ID_TRN_ORG = iD_TRN_ORG;
	}
	/**
	 * @return the dC_DY_BSN_ORG
	 */
	public String getDC_DY_BSN_ORG() {
		return DC_DY_BSN_ORG;
	}
	/**
	 * @param dC_DY_BSN_ORG the dC_DY_BSN_ORG to set
	 */
	public void setDC_DY_BSN_ORG(String dC_DY_BSN_ORG) {
		DC_DY_BSN_ORG = dC_DY_BSN_ORG;
	}
	/**
	 * @return the aI_LN_ITM_ORG
	 */
	public Integer getAI_LN_ITM_ORG() {
		return AI_LN_ITM_ORG;
	}
	/**
	 * @param aI_LN_ITM_ORG the aI_LN_ITM_ORG to set
	 */
	public void setAI_LN_ITM_ORG(Integer aI_LN_ITM_ORG) {
		AI_LN_ITM_ORG = aI_LN_ITM_ORG;
	}
	/**
	 * @return the iD_STR_RT_ORG
	 */
	public String getID_STR_RT_ORG() {
		return ID_STR_RT_ORG;
	}
	/**
	 * @param iD_STR_RT_ORG the iD_STR_RT_ORG to set
	 */
	public void setID_STR_RT_ORG(String iD_STR_RT_ORG) {
		ID_STR_RT_ORG = iD_STR_RT_ORG;
	}
	/**
	 * @return the iD_SHP_MTH
	 */
	public Integer getID_SHP_MTH() {
		return ID_SHP_MTH;
	}
	/**
	 * @param iD_SHP_MTH the iD_SHP_MTH to set
	 */
	public void setID_SHP_MTH(Integer iD_SHP_MTH) {
		ID_SHP_MTH = iD_SHP_MTH;
	}
	/**
	 * @return the sPL_INSTRC
	 */
	public String getSPL_INSTRC() {
		return SPL_INSTRC;
	}
	/**
	 * @param sPL_INSTRC the sPL_INSTRC to set
	 */
	public void setSPL_INSTRC(String sPL_INSTRC) {
		SPL_INSTRC = sPL_INSTRC;
	}
	/**
	 * @return the aDS_SHP
	 */
	public String getADS_SHP() {
		return ADS_SHP;
	}
	/**
	 * @param aDS_SHP the aDS_SHP to set
	 */
	public void setADS_SHP(String aDS_SHP) {
		ADS_SHP = aDS_SHP;
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
