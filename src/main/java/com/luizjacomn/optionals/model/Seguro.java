package com.luizjacomn.optionals.model;

import java.math.BigDecimal;

public class Seguro {

	private String cobertura;
	
    private BigDecimal valorFranquia;
    
    public Seguro(String cobertura, String valorFranquia) {
    	this.cobertura = cobertura;
    	this.valorFranquia = new BigDecimal(valorFranquia);
    }
    
    public Seguro(String cobertura, double valorFranquia) {
    	this.cobertura = cobertura;
    	this.valorFranquia = BigDecimal.valueOf(valorFranquia);
    }

    public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	public BigDecimal getValorFranquia() {
		return valorFranquia;
	}
	public void setValorFranquia(BigDecimal valorFranquia) {
		this.valorFranquia = valorFranquia;
	}
}