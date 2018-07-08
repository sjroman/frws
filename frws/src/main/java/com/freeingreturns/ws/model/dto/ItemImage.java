package com.freeingreturns.ws.model.dto;

import java.io.Serializable;

//object to be used to get data from and put data into IMG_ITM table
public class ItemImage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8811255383246960757L;
	//primary key is (ID_STR_RT, ID_WS, DC_DY_BSN, AI_TRN, AI_LN_ITM)
	//required
	private String ID_STR_RT; //RetailStoreId
	//required
	private String ID_WS; //WorkstationId
	//required
	private String DC_DY_BSN; //BusinessDay
	//required
	private int AI_TRN; //TransactionSequenceNumber
	//required
	private int AI_LN_ITM; //RetailTransactionLineItemSequenceNumber
	//required
	private String ID_ITM_POS; //POSItemId
	//required
	private String ID_ITM; //ItemId
	//required
	private String ID_IM; //ImageId
	
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
	public int getAI_TRN() {
		return AI_TRN;
	}
	/**
	 * @param aI_TRN the aI_TRN to set
	 */
	public void setAI_TRN(int aI_TRN) {
		AI_TRN = aI_TRN;
	}
	/**
	 * @return the aI_LN_ITM
	 */
	public int getAI_LN_ITM() {
		return AI_LN_ITM;
	}
	/**
	 * @param aI_LN_ITM the aI_LN_ITM to set
	 */
	public void setAI_LN_ITM(int aI_LN_ITM) {
		AI_LN_ITM = aI_LN_ITM;
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
	 * @return the iD_IM
	 */
	public String getID_IM() {
		return ID_IM;
	}
	/**
	 * @param iD_IM the iD_IM to set
	 */
	public void setID_IM(String iD_IM) {
		ID_IM = iD_IM;
	}
}
