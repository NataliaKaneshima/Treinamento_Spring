package br.com.kaneshima.exercicio_teste.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.kaneshima.exercicio_teste.model.entities.Produto;

@RestController
@RequestMapping(" /api/produtos")
public class ProdutoController {
	
	@PostMapping
	public Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		
		return produto;
	}
}
