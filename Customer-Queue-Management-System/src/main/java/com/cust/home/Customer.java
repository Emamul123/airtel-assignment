package com.cust.home;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Customer implements Serializable {
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int customerId;
	@Column(name = "customer_nm")
	protected String customerName;
	@Column(name = "type_of_cutomer")
	protected String TypeOfCustomer;
	@Column(name = "description")
	protected String Description;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTypeOfCustomer() {
		return TypeOfCustomer;
	}

	public void setTypeOfCustomer(String typeOfCustomer) {
		TypeOfCustomer = typeOfCustomer;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
