package com.mandarimja.himandarim.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historias")
public class Histórias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "conteudo")
	private String conteúdo;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getConteúdo() {
		return conteúdo;
	}
	public void setConteúdo(String conteúdo) {
		this.conteúdo = conteúdo;
	}
	
	
	
	
	
	

}
