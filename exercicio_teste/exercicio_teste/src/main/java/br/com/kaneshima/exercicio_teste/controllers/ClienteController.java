package br.com.kaneshima.exercicio_teste.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kaneshima.exercicio_teste.models.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping(path = "cliente/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}
}
