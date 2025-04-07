package com.curso.java.repository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.curso.java.model.Java;
import com.github.javafaker.Faker;

import lombok.Data;

@Data
@Repository
public class JavaRepository {

	private final List<Java> javaslista = new ArrayList<>();

	private final Faker faker = new Faker();

	public int criarJavas() {

		for (int x = 0; x < 10; x++) {
			Java j = new Java();
			int randomNum = (int) (Math.random() * 101);
			j.setId(randomNum);
			j.setNome(faker.gameOfThrones().character());
			j.setIdade(faker.date().birthday().getYear());
			j.setDataNascimento(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(faker.date().birthday())));
			javaslista.add(j);
		}
		return javaslista.size();
	}

	public List<Java> javas() {

		return javaslista;
	}

}
