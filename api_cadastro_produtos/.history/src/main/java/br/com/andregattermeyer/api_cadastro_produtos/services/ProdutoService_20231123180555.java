package br.com.andregattermeyer.api_cadastro_produtos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andregattermeyer.api_cadastro_produtos.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
     @Autowired
        private ProdutoRepository produtoRepository;

        /**
         * Método para retornar uma lista de produtos.
         * @return Lista de produtos.
         */
        public List<Product> obterTodos() {
                return produtoRepository.findAll();
        }

        /**
         * Método que retorna o produto encontrado pelo seu id.
         * @param id do Product que será localizado.
         * @return Retorna um produto caso tenga sido encontrado.
         */
        public Optional <Product> obterPorId(Integer id) {
                return productRepository.findById(id);
        }

        public Product adicionar(Product product) {

                return productRepository.save(product);
        }

        /**
        *Método para deletar o Product por id.
        * @param id do Product a ser deletado.
        */
        public void deletar(Integer id) {
                productRepository.deleteById(id);
        }

         /**
     * Método para atualizar o product na lista.
     * @param Product que será atualizado.
     * @param id do produto.
     * @return Retorna o produto após atualizar a lista.
     */
    public Product atualizar(Integer id, Product product) {

        //Poderia ter alguma validação no ID.
        product.setId(id);

        return productRepository.save(product);
    }
}
