package br.com.dududueedu.investBackend.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id incremental
	private Long codigo;
	
	private String codigoAtivo;
	private Double valorCota;
	private Integer quantidadeCotas;
	private LocalDate dataCompra;
}