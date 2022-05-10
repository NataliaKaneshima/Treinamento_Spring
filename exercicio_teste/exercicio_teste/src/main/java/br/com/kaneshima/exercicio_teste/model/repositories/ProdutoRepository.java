package br.com.kaneshima.exercicio_teste.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.kaneshima.exercicio_teste.model.entities.Produto;

public interface ProdutoRepository 
				extends CrudRepository<Produto, Integer>{
	
}
 