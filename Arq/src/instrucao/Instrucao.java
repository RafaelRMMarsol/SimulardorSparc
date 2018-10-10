
package instrucao;

import java.util.ArrayList;
import operando.Operando;
import registrador.Registrador;

public class Instrucao {
    private Operando operando;
    private Registrador registrador;
    
    public String busca(ArrayList<Registrador>reg, int num){
        String msg = "";
        for(Registrador r:reg){
            if(r.getOperando().getNum()==num){
                return r.getNome();
            }
            else{
                msg = msg + "Esse número não existe";
            }
        }
        return msg;
    }
    
    public void decotificar(){
        
    }
    
    public void calcularOperando(){
        
    }
    
    public void buscarOperando(){
        
    }
    
    public void execucao(){
        
    }
    
    public void armazena(){
        
    }

    public Operando getOperando() {
        return operando;
    }

    public void setOperando(Operando operando) {
        this.operando = operando;
    }
}