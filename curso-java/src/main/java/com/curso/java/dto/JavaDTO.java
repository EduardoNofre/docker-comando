package com.curso.java.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class JavaDTO {

	@Schema(name = "id", description = "Número identificador", example = "123", type = "Integer")
	private Integer id;

	@Schema(name = "nome", description = "Nome", example = "123", type = "Integer")
	private String nome;

	@Schema(name = "idade", description = "idade", example = "123", type = "Integer")
	private Integer idade;
}
