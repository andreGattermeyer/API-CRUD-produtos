package br.com.andregattermeyer.api_cadastro_produtos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andregattermeyer.api_cadastro_produtos.model.Produto;
import br.com.andregattermeyer.api_cadastro_produtos.services.ProdutoService;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {
    
    @Autowired
        private ProdutoService produtoService;

        @GetMapping
        public List<Produto> findAll() {
                return produtoService.obterTodos();
        }

        @PostMapping
        public Product save(@RequestBody Product product) {
                return productService.adicionar(product);
        }

        @GetMapping("/{id}")
        public ResponseEntity<Product> findById(@PathVariable Integer id) {
                return productService.obterPorId(id)
                .map( p -> ResponseEntity
                .ok()
                .body(p))
                .orElseThrow(() -> new IllegalArgumentException("Id não existe"));
        }

        @DeleteMapping("/{id}")
        public String deleteById(@PathVariable Integer id) {
        productService.deletar(id);
        return "Produto com id: " + id + " foi deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public Product save(@RequestBody Product product, @PathVariable Integer id) {
        return productService.atualizar(id, product);
    }
}
