package com.fujitsu.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
 * Author:Shalaka havele
 * Creation Date:19/03/2019(DD/MM/YYYY)
 * Modification Date:02/04/2019(DD/MM/YYYY)
 * Version:7.0
 * Copyright: Fujitsu consulting pvt ltd.All rights reserved.
 * Description:It represents database entity
 * 				It is Java Bean class
 * 
 */

@Component
@Entity
@Table(name="bills")

public class Bill implements Serializable 
{
	@Id
	@GeneratedValue(generator="increment")
	@Column(name="bill_id")
	private int billId;
	
	@Column
	private int total_amt;
	
	@Column
	private LocalDate bill_date;
	
	@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="paymentId")
    private Payment paymentId;
    
   
    @Autowired
	public Bill() {
		// TODO Auto-generated constructor stub
	}
	

	
	public Bill(int billId, int total_amt, LocalDate bill_date, Payment paymentId) {
		super();
		this.billId = billId;
		this.total_amt = total_amt;
		this.bill_date = bill_date;
		this.paymentId = paymentId;
	}


	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getTotal_amt() {
		return total_amt;
	}

	public void setTotal_amt(int total_amt) {
		this.total_amt = total_amt;
	}

	public LocalDate getBill_date() {
		return bill_date;
	}

	public void setBill_date(LocalDate localDate) {
		this.bill_date = localDate;
	}

	public Payment getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Payment paymentId) {
		this.paymentId = paymentId;
	}
	
	
}
