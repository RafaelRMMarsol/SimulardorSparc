
package arq;

import instrucao.Instrucao;
import java.util.ArrayList;
import java.util.Random;
import operando.Operando;



public class Arq {

    private static final ArrayList<Instrucao>intList = new ArrayList<>();
  
    public static void main(String[] args) {
        telaPrinci tela = new telaPrinci();
        tela.setVisible(true);
        
        
        
    }
    
    public void casdastraIns(String escolha, int num, int num2){
        Instrucao ins = new Instrucao();
        Operando op = new Operando();
        Operando op2 = new Operando();
        ins.setNome(escolha);
        op.setNum(num);
        ins.setOperando1(op);
        op2.setNum(num2);
        ins.setOperando2(op2);
        ins.setOperandoResult(escolha);
        intList.add(ins);
    }
    
    public ArrayList<Instrucao> getListaIns(){
        return this.intList;
    }
}
