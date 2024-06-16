package br.com.andregattermeyer.api_cadastro_produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andregattermeyer.api_cadastro_produtos.model.Produto;

public interface ProdutoRepository<UPDATE> extends CRepository<Produto, Long> {

}
