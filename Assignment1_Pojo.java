package com.hrc.example;

public class Assignment1_Pojo {
	private String First_Name;
	private String Last_Name;
	private Integer serial;
	private String Alias;
	private String Quote;
	
	
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	/**
	 * @return the last_Name
	 */
	public String getLast_Name() {
		return Last_Name;
	}
	/**
	 * @param last_Name the last_Name to set
	 */
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public Integer getSerial() {
		return serial;
	}
	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	public String getAlias() {
		return Alias;
	}
	public void setAlias(String alias) {
		Alias = alias;
	}
	public String getQuote() {
		return Quote;
	}
	public void setQuote(String quote) {
		Quote = quote;
	}
	
}
