package br.com.andregattermeyer.api_cadastro_produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.andregattermeyer.api_cadastro_produtos.model.Produto;

public interface ProdutoRepository<UPDATE> extends CrudRepository<Produto, Long> {

}
