package com.belval.crudrest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.belval.crudrest.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	
	//like '%alguma coisa%' coringa
	//lower / uper 
	//select * from produto where descricao like "%descricao%"
	
	List <Produto> findByDescricaoContainingIgnoreCase(String descricao);
}
