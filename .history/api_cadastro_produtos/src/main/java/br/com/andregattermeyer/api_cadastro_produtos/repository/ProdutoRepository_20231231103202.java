package br.com.andregattermeyer.api_cadastro_produtos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andregattermeyer.api_cadastro_produtos.model.Produto;

public interface ProdutoRepository<UPDATE> extends JpaRepository<Produto, Long>{

    Optional<Produto> findById(Long id, int quantidade);
    
    

}
