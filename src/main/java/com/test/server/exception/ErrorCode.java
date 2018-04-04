package com.test.server.exception;

import java.util.NoSuchElementException;

public enum ErrorCode {
	
	INVALID_SESSION_LINK_STATUS_CHANGED(996), 
	INVALID_SESSION(997), 
	USER_NOT_FOUND(998), 
	BASE_DB_ERROR(999), 
	UNEXPECTED_ERROR(1000), 
	INSUFFICIENT_PARAMETERS(1001), 
	USER_ALREADY_EXIST(1002), 
	USER_AUTHENTICATION_FAILED(1003), 
	INVALID_USER_INFO(1004), 
	GENERIC_ERROR(1111), 
	FILE_OPERATION_ERROR(1005) ,
	PARSE_EXCEPTION(1006),
	CASENO_ALREADY_GENERATED(1007),
	CASENO_GENERATE_FAILED(1008),
	VALIDITY(1009),
	COMPLETENESS_VALIDITY(1010),
	DATEISNOTVALID(1011),
	VALID(1012),
	FILE_NOT_EXIST(1013),
   UNIQUE_CONSTRAINT(1014), 
   UNKNOWN_IP(1015), 
   PASSWORD_DATE_EXCEED(1016);
	private final int codeId;

	private ErrorCode(final int codeId) {
		this.codeId = codeId;
	}

	public int getCodeId() {
		return this.codeId;
	}

	/**
	 * Converts an int value into an ErrorCode
	 * 
	 * @param errorCode
	 * @return {@link ErrorCode}
	 */
	public static ErrorCode getExceptionCode(final int errorCode) {

		ErrorCode eErrorCode = null;
		for (final ErrorCode status : ErrorCode.values()) {
			if (status.getCodeId() == errorCode) {
				eErrorCode = status;
				break;
			}
		}
		if (null == eErrorCode) {
			throw new NoSuchElementException("The received code " + errorCode + " is not valid !!!");
		} else {
			return eErrorCode;
		}

	}

}
