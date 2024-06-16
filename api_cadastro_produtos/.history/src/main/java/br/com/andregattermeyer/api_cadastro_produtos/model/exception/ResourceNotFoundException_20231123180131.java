package br.com.andregattermeyer.api_cadastro_produtos.model.exception;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException (String mensagem){
        super(mensagem);
    }
}
