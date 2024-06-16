package br.com.andregattermeyer.api_cadastro_produtos.model.exception;


public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException (String mensagem){
        super(mensagem);
    }
}
