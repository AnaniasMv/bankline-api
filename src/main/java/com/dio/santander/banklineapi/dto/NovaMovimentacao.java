package com.dio.santander.banklineapi.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.dio.santander.banklineapi.model.Movimentacaotipo;

public class NovaMovimentacao {
private String descricao;
	private Double valor;
	private Movimentacaotipo tipo;
	private Integer idConta;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Movimentacaotipo getTipo() {
		return tipo;
	}
	public void setTipo(Movimentacaotipo tipo) {
		this.tipo = tipo;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	
	
}
