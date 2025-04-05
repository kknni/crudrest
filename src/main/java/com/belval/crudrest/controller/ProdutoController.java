package com.belval.crudrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.belval.crudrest.model.Produto;
import com.belval.crudrest.repository.ProdutoRepository;


@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping ("/produtos")
	public ResponseEntity<Iterable<Produto>> obterProdutos(){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(repository.findAll());
		
	}
	
	
	// BD H2 SGBD EMBARGADO
	
	@PostMapping("/produtos")
	public ResponseEntity<Produto> criarProduto(
			@RequestBody Produto produto){
		
		
//curl POST http://localhost:8080/produtos -H "Content-Type: application/json; Charset=utf-8" -d @produto-pao.json
		
		
		System.out.println("Produto criado..." + produto.toString());
		repository.save(produto); 
		
		
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(produto);
		
		
	}
	
	
}
