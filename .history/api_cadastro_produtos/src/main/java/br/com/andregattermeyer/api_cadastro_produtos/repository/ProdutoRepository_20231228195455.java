package br.com.andregattermeyer.api_cadastro_produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andregattermeyer.api_cadastro_produtos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
    UPDATE produtos SET quantidade = quantidade - quantidade_vendida WHERE id = id_produto;

}
