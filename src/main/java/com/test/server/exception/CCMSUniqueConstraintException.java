package com.test.server.exception;

public class CCMSUniqueConstraintException extends CCMSException {
	
	private static final long serialVersionUID = 4265758284484258031L;

	public static final String UNHANDLED_EXCEPTION_TXT = "Unhandled Exception !!! ";

	private String[] messages;

	public CCMSUniqueConstraintException(final String[] messages) {
		this.setMessages(messages);
	}

	/**
	 * @return the messages
	 */
	public String[] getMessages() {
		return messages;
	}

	/**
	 * @param messages
	 *            the messages to set
	 */
	public void setMessages(String[] messages) {
		this.messages = messages;
	}


}
