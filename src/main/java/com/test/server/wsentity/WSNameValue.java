package com.test.server.wsentity;

public class WSNameValue {
	
	private Long id;
	private String value;
	private String code;

	public WSNameValue(){}

	/**
	 * Key Value Constructor
	 * @param id
	 * @param value
	 */
	public WSNameValue(Long id,String value){
		this.id = id;
		this.value= value;
	}
	
	/**
	 * @param id
	 * @param value
	 * @param code
	 */
	public WSNameValue(Long id, String value, String code) {
		this.id = id;
		this.value = value;
		this.code = code;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
