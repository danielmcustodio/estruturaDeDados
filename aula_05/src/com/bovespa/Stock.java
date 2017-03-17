package com.bovespa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Stock {
	
	private String codigo;
	
	private LocalDate data;
	
	private BigDecimal openPrice;
	
	private BigDecimal closePrice;
	
	private BigDecimal maxPrice;
	
	private BigDecimal minPrice;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public BigDecimal getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}

	public BigDecimal getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}

	public BigDecimal getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}

	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}
	
	
}
