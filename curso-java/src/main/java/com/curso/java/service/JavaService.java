package com.curso.java.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.java.dto.JavaDTO;
import com.curso.java.repository.JavaRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class JavaService {

	
	@Autowired
	private JavaRepository javaRepository;

	@Autowired
	private ModelMapper modelMapper;
	
	public Integer criarPessoas() {
		//log.info("criar todas as pessoas");
		return javaRepository.criarJavas();
	}
	
	
	public List<JavaDTO> javas() {
		//log.info("lista todas as pessoas");
		return modelMapper.map(javaRepository.javas(), new TypeToken<List<JavaDTO>>() {
		}.getType());
	}
}
