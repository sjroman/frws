package com.freeingreturns.ws.model.responses;

import com.freeingreturns.ws.utils.errorhandling.ErrorCode;

public class DeleteCustomerResponse {

	private ErrorCode status;
	private String statusDesc;
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
