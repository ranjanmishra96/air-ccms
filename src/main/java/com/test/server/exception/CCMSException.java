package com.test.server.exception;

public class CCMSException extends RuntimeException {
	
	 private static final long serialVersionUID = 4265758284484258031L;

	    public static final String UNHANDLED_EXCEPTION_TXT = "Unhandled Exception !!! ";

	    private String message;
	    private ErrorCode errorCode;
	    protected long timestamp;
	    private boolean logged;
	    private String errorIdentifier;
	    
	    public CCMSException(){}

	    public CCMSException(final String message, final ErrorCode code) {
		this.setMessage(message);
		this.errorCode = code;
		init();
	    }
	    
	    public CCMSException(final String message, final ErrorCode code,final String errorIdentifier) {
	    	this.setMessage(message);
	    	this.errorCode = code;
	    	this.errorIdentifier=errorIdentifier;
	    	init();
	       }

	    public CCMSException(final String message, final ErrorCode code,
		    final Throwable throwable) {
		super(throwable);
		this.errorCode = code;
		this.setMessage(message);
		init();
	    }

	    private void init() {
		timestamp = System.nanoTime();
	    }

	    /**
	     * @return the message
	     */
	    public String getMessage() {
		return message;
	    }

	    /**
	     * @param message
	     *            the message to set
	     */
	    public void setMessage(String message) {
		this.message = message;
	    }

	    /**
	     * @return the errorCode
	     */
	    public ErrorCode getErrorCode() {
		return errorCode;
	    }

	    /**
	     * @param errorCode
	     *            the errorCode to set
	     */
	    public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	    }

	    /**
	     * @return the timestamp
	     */
	    public long getTimestamp() {
		return timestamp;
	    }

	    /**
	     * @param timestamp
	     *            the timestamp to set
	     */
	    public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	    }

	    /**
	     * @return the logged
	     */
	    public boolean isLogged() {
		return logged;
	    }

	    /**
	     * @param logged
	     *            the logged to set
	     */
	    public void setLogged(boolean logged) {
		this.logged = logged;
	    }

		/**
		 * @return the errorIdentifier
		 */
		public String getErrorIdentifier() {
			return errorIdentifier;
		}

		/**
		 * @param errorIdentifier the errorIdentifier to set
		 */
		public void setErrorIdentifier(String errorIdentifier) {
			this.errorIdentifier = errorIdentifier;
		}
	    
	    

}
