package com.hrc.FinalProj;

public class FinalPojo {
	//private String business_code;
	private String name_customer;
	//private String clear_date;
//	private int business_year;
//	private long doc_id;
//	private String posting_date;
//	private String document_create_date;
	private String due_in_date;
//	private String invoice_currency;
//	private String document_type;
//	private short posting_id;
//	private String area_business;
	private double total_open_amount;
	//private String baseline_create_date;
	//private String cust_payment_terms;
	private String invoice_id;
	//private short isOpen;
	private String notes;
	private String cust_number;
	
	
	public String getCust_number() {
		return cust_number;
	}
	public void setCust_number(String cust_number) {
		this.cust_number = cust_number;
	}
	public String getName_customer() {
		return name_customer;
	}
	public void setName_customer(String name_customer) {
		this.name_customer = name_customer;
	}
	
	
	public String getDue_in_date() {
		return due_in_date;
	}
	public void setDue_in_date(String due_in_date) {
		this.due_in_date = due_in_date;
	}
	public double getTotal_open_amount() {
		return total_open_amount;
	}
	public void setTotal_open_amount(double total_open_amount) {
		this.total_open_amount = total_open_amount;
	}
	public String getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
	
		
}
