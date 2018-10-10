
package registrador;

import instrucao.Instrucao;
import operando.Operando;

public class Registrador {
    
    private String nome;
    private Instrucao instrucao;
    private Operando operando;

    
    public Operando getOperando() {
        return operando;
    }

    public void setOperando(Operando operando) {
        this.operando = operando;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setInstrucao(Instrucao instrucao){
        this.instrucao = instrucao;
    }
   public Instrucao getInstrucao(){
       return instrucao;
   }
}
