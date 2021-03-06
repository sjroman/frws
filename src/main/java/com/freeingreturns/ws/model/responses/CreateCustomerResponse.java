package com.freeingreturns.ws.model.responses;

import javax.xml.bind.annotation.XmlRootElement;

import com.freeingreturns.ws.utils.errorhandling.ErrorCode;

@XmlRootElement
public class CreateCustomerResponse {
	private String ID_CT;
	private ErrorCode status;
	private String statusDesc;
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
	 * @return the status
	 */
	public ErrorCode getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(ErrorCode status) {
		this.status = status;
	}
	/**
	 * @return the statusDesc
	 */
	public String getStatusDesc() {
		return statusDesc;
	}
	/**
	 * @param statusDesc the statusDesc to set
	 */
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
}
