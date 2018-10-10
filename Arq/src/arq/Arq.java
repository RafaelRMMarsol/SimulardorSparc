
package arq;

import java.util.ArrayList;
import registrador.Registrador;//import em tudo
import operando.Operando;


public class Arq {

    private final ArrayList<Registrador>regList = new ArrayList<>();
  
    public static void main(String[] args) {
        
        
    }
    
    public void receberOperando(int num){
        Operando operando = new Operando();
        operando.setNum(num);
    }
}
