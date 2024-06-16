package br.com.andregattermeyer.api_cadastro_produtos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.andregattermeyer.api_cadastro_produtos.model.Produto;
import br.com.andregattermeyer.api_cadastro_produtos.repository.ProdutoRepository;

@Service
public class ProdutoService {

        private ProdutoRepository produtoRepository;

        public ProdutoService(ProdutoRepository produtoRepository) {
                this.produtoRepository = produtoRepository;
        }

        /**
         * Método para retornar uma lista de produtos.
         * 
         * @return Lista de produtos.
         */
        public List<Produto> obterTodos() {
                return (List<Produto>) produtoRepository.findAll();
        }

        /**
         * Método que retorna o produto encontrado pelo seu id.
         * 
         * @param id do Product que será localizado.
         * @return Retorna um produto caso tenga sido encontrado.
         */
        public Optional<Produto> obterPorId(Long id) {
                return produtoRepository.findById(id);
        }

        /**
         * Método para adicionar um produto na lista.
         * 
         * @param produto que será adicionado.
         * @return Retorna o produto que o usuário(funcionário) cadastrou
         */
        public Produto adicionar(Produto produto) {

                return (Produto) produtoRepository.save(produto);
        }

        /**
         * Método para deletar o Product por id.
         * 
         * @param id do Product a ser deletado.
         */
        public void deletar(Long id) {
                produtoRepository.deleteById(id);
        }

        /**
         * Método para atualizar o product na lista.
         * 
         * @param Product que será atualizado.
         * @param id      do produto.
         * @return Retorna o produto após atualizar a lista.
         */
        public Produto atualizar(Long id, Produto produto) {

                // Poderia ter alguma validação no ID.
                produto.setId(id);

                return (Produto) produtoRepository.save(produto);
        }

}
