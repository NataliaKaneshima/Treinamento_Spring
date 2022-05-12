package br.com.kaneshima.exercicio_teste.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.kaneshima.exercicio_teste.model.entities.Produto;

public interface ProdutoRepository 
				extends PagingAndSortingRepository<Produto, Integer>{
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
 