package br.com.kaneshima.exercicio_teste.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@RequestMapping(path =  "/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
	
	@RequestMapping(path =  "/subtrair")
	public int subtrair(@PathVariable int a, int b) {
		return a - b;
	}
}
