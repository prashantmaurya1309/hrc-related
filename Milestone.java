package com.hrc.milestone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Types;
import java.util.ArrayList;

public class Milestone {
	
	
	
	
	public static ArrayList<MilestonePojo> csvReader() {
		ArrayList<MilestonePojo> invoiceList=new ArrayList<>();
		String line = "";  
		String splitBy = ",";  
		try {  
			//parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\prash\\Desktop\\hrc react and java\\1828259.csv")); 
			line = br.readLine();  // to remove column names
			long count=0;
			while ((line = br.readLine()) != null) {   //returns a Boolean value
			    MilestonePojo invoiceRecord=new MilestonePojo();
				String[] invoice = line.split(splitBy);  // use comma as separator
				if(invoice[17].isEmpty()) {
					continue;
				}
				count++;
				invoiceRecord.setBusiness_code(invoice[0]);
				invoiceRecord.setCust_number(invoice[1]);
				invoiceRecord.setName_customer(invoice[2]);
				invoiceRecord.setClear_date(invoice[3]);
				invoiceRecord.setBusiness_year(invoice[4]);
				invoiceRecord.setDoc_id(invoice[5]);
				invoiceRecord.setPosting_date(invoice[6]);
				invoiceRecord.setDocument_create_date(invoice[8]);
				invoiceRecord.setDue_in_date(invoice[9]);
				invoiceRecord.setInvoice_currency(invoice[10]);
				invoiceRecord.setDocument_type(invoice[11]);
				invoiceRecord.setPosting_id(invoice[12]);
				invoiceRecord.setArea_business(invoice[13]);
				invoiceRecord.setTotal_open_amount(invoice[14]);
				invoiceRecord.setBaseline_create_date(invoice[15]);
				invoiceRecord.setCust_payment_terms(invoice[16]);
				invoiceRecord.setInvoice_id(invoice[17]);
				invoiceRecord.setIsOpen(invoice[18]);
				
				invoiceList.add(invoiceRecord);
			} 
				
			System.out.println(count+" Rows Processed");
			br.close();
		}catch (IOException e) {  
			e.printStackTrace();  
		}
		return invoiceList;
	}  
	
	
	
	public static void addInvoiceDetails(ArrayList<MilestonePojo> invoiceList, int i){
		int count=0;
		int duplicate=0;
		String sql = "INSERT INTO invoice_details VALUES(?,?,?,?,?,?,?,STR_TO_DATE(?,'%Y%m%d'),STR_TO_DATE(?,'%Y%m%d'),?,?,?,?,?,STR_TO_DATE(?,'%Y%m%d'),?,?,?);";
		try(Connection con = DatabaseConnection.initializeDatabase();
				PreparedStatement statement = con.prepareStatement(sql);) { 
			for (MilestonePojo invoice: invoiceList) {
				int psIndex=1;
			    statement.setString(psIndex++,invoice.getBusiness_code());
			    statement.setString(psIndex++,invoice.getCust_number()); 
			    statement.setString(psIndex++,invoice.getName_customer());
			    if(invoice.getClear_date().isEmpty()) {
				    statement.setNull(psIndex++,Types.NULL);
			    }
			    else {
				    statement.setString(psIndex++,invoice.getClear_date());
			    }
			    statement.setInt(psIndex++,invoice.getBusiness_year());
			    statement.setLong(psIndex++,invoice.getDoc_id()); 
			    statement.setString(psIndex++,invoice.getPosting_date());
			    statement.setString(psIndex++,invoice.getDocument_create_date());
			    statement.setString(psIndex++,invoice.getDue_in_date());
			    statement.setString(psIndex++,invoice.getInvoice_currency());
			    statement.setString(psIndex++,invoice.getDocument_type());
			    statement.setShort(psIndex++,invoice.getPosting_id());
				statement.setString(psIndex++,invoice.getArea_business());
			    statement.setDouble(psIndex++,invoice.getTotal_open_amount());
			    statement.setString(psIndex++,invoice.getBaseline_create_date());
			    statement.setString(psIndex++,invoice.getCust_payment_terms());
			    statement.setLong(psIndex++,invoice.getInvoice_id());
			    statement.setShort(psIndex++,invoice.getIsOpen());
			
			    statement.addBatch();
			    count++;
			    System.out.println(count+" Records added to batch");
			}
			int[] affectedRecords = statement.executeBatch();
	    	System.out.println(affectedRecords.length+ " Executed");
			
			statement.close();
			con.close();
	  }catch (Exception e) { 
			e.printStackTrace(); 
		}
		System.out.println(count+" Rows Inserted");
		System.out.println(duplicate+" Duplicate Rows Found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MilestonePojo> invoiceList=new ArrayList<>();
		invoiceList = csvReader();
		addInvoiceDetails(invoiceList,50000);
	}

}
