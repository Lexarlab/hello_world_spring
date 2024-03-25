package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@GetMapping() // Requisições do Tipo GET/Busca	
	public String hello() {
		return "Hello World! Este é meu primeiro projeto em Spring :) <br> <br> "
				+ "Lista das BSM's da Generation Brasil: <br> <br> "
				+ "- Persistência; <br>"
				+ "- Mentalidade de Crescimento; <br>"
				+ "- Responsalidade Pessoal; <br>"
				+ "- Orientação ao Futuro; <br>"
				+ "- Proatividade; <br>"
				+ "- Comunicação; <br>"
				+ "- Trabalho em Equipe; <br>"
				+ "- Orientação ao Detalhe; <br>"
				+ "- Utilizar boas práticas de programação ao executar as atividades atribuídas; <br>"
				+ "- Executar testes de forma consistente e proativa para verificar se o código está correto; <br>"
				+ "- Aprender novas habilidades técnicas e não técnicas, de forma proativa, para melhorar seu desempenho e aumentar a probabilidade de uma promoção; <br>"
				+ "- Comunicar-se e colaborar de forma eficaz com colegas de trabalho e outras partes interessadas, usando uma variedade de plataformas. <br> <br>"
				+ "Meus objetivos de aprendizagens são: <br> <br>"
				+ "Melhorar e revisar meu entendimento sobre POO em Java; <br>"
				+ "Compreender o funcionante da API Spring.";
	}
	

}
