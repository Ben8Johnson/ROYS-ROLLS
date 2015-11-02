package raysrentals.co.uk.rays_rentals.bike;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import raysrentals.co.uk.rays_rentals.customer.Customer;
@Entity()
@Table(name = "rental_record")
public class RentalRecord {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private Date rentDate;
	
	@Column
	private Date timeOut;
	
	@Column
	private Date timeBackDue;
	
	@Column
	private Date timeBackActual;
	
	@Column
	private float amountPaid;
	
	@JoinColumn(name = "bike_id")
	@ManyToOne()
	private Bike bike;
	
	@JoinColumn(name = "customer_id")
	@ManyToOne()
	private Customer customer;

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	public Date getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Date timeOut) {
		this.timeOut = timeOut;
	}

	public Date getTimeBackDue() {
		return timeBackDue;
	}

	public void setTimeBackDue(Date timeBackDue) {
		this.timeBackDue = timeBackDue;
	}

	public Date getTimeBackActual() {
		return timeBackActual;
	}

	public void setTimeBackActual(Date timeBackActual) {
		this.timeBackActual = timeBackActual;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public float getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Long getId() {
		return id;
	}
}
