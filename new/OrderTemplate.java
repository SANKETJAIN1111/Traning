package com.legatohealth.beans;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.thoughtworks.xstream.converters.time.ZonedDateTimeConverter;

import rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier;
//import org.springframework.boot.configurationprocessor.json.JSONObject;

@Entity
@Table(name = "Orders")
public class OrderTemplate {
	
	@Id
	@Column(name = "oid")
//	@GenericGenerator(name = "num_gen", strategy = "com.example.backendjava.utils.NumericGenerator",
//		parameters = {
//				@Parameter(name = "value", value = "22")
//		}
//	)
//	@GeneratedValue(strategy = GenerationType.AUTO, generator="num_gen")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderID;
	
	//@Temporal(TemporalType.DATE)
	@Column(name = "orderDate")
	private String date ;
	
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "orderAddressID")
//	@JsonProperty("address")
//	private ShippingAddressTemplate shipAddress;
	
	@JoinColumn(name = "orderID")
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	@JsonProperty("products")
	private List<ProductEntity> products = new ArrayList<ProductEntity>();
	
	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public OrderTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
	 LocalDateTime lDateTime =LocalDateTime.now();
		this.date= dateTimeFormatter.format(lDateTime);
	}
}