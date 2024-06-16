package br.com.andregattermeyer.api_cadastro_produtos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String fabricante;

    private String quantidade;

    private Double preco;


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", fabricante='" + getFabricante() + "'" +
            ", quantidade='" + getQuantidade() + "'" +
            ", preco='" + getPreco() + "'" +
            "}";
    }


}
