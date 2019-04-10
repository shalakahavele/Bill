package com.fujitsu.beans;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
@Entity
@Table(name="PAYMENT")
public class Payment implements Serializable{
	
	@Id
	@GeneratedValue(generator="increment")
	private long paymentId;
	
	@Column(length=30,nullable=false)
	private String paymentMode;
	
	private float amount;
	
	@Column(length=30,nullable=false)
	private String cardholderName;
	
	private long cardNumber;
	private LocalDate expieryDate;
	
	private LocalDateTime paymentDate;
	
	@OneToOne(mappedBy="paymentId")
	private Bill billId;
	
	@Autowired
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	
	/*public Payment(long paymentId, String paymentMode, long amount, String cardholderName, long cardNumber,
			LocalDate expieryDate, LocalDateTime paymentDate) {
		super();
		this.paymentId = paymentId;
		this.paymentMode = paymentMode;
		this.amount = amount;
		this.cardholderName = cardholderName;
		this.cardNumber = cardNumber;
		this.expieryDate = expieryDate;
		this.paymentDate=paymentDate;
	}*/
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getCardholderName() {
		return cardholderName;
	}
	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getExpieryDate() {
		return expieryDate;
	}
	public void setExpieryDate(LocalDate expieryDate) {
		this.expieryDate = expieryDate;
	}
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	public Bill getBillId() {
		return billId;
	}

	public void setBill(Bill billId) {
		this.billId = billId;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentMode=" + paymentMode + ", amount=" + amount
				+ ", cardholderName=" + cardholderName + ", cardNumber=" + cardNumber + ", expieryDate=" + expieryDate
				+ ", paymentDate=" + paymentDate + ", bill=" + billId + "]";
	}

	
	
	
	

}
