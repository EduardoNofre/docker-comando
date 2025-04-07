package com.curso.java.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Java {

	private Integer id;
	private String nome;
	private Integer idade;
	private LocalDate DataNascimento;

}
