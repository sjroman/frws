package com.freeingreturns.ws.utils.errorhandling;

public enum ErrorCode {
	NoError,
	MissingRequiredField,
	MalformedDTO, 
	JavaError, 
	BackEndError,
	NoResults,
	DatabaseError,
	InvalidInput,
	DuplicateEntity
}
