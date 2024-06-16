package br.com.andregattermeyer.api_cadastro_produtos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@
public class Produto {
    
    private Long id;

    private String nome;

    private String fabricante;

    private String quantidade;

    private Double preco;
}
