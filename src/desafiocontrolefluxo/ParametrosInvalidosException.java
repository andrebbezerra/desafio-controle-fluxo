
package desafiocontrolefluxo;

/**
 *
 * @author andre
 */
public class ParametrosInvalidosException extends Exception{
    
        public ParametrosInvalidosException() {
        super("O valor do primeiro parametro precisa ser menor que o segundo");
    }
        
}