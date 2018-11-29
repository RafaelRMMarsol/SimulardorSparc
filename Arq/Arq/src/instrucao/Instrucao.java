
package instrucao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import operando.Operando;


public class Instrucao {
    private String nome;
    private Operando operando1;
    private Operando operando2;
    private int operandoResult;
    
    public int calcularOperandoSoma(int num, int num2){
        return num+num2;
    }
    
    public int calcularOperandoSub(int num, int num2){
        return num - num2;
    }
    
    public int calcularOperandoMult(int num, int num2){
        return num * num2;
    }
    
    public int calcularOperandoDiv(int num, int num2){
        return num / num2;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Operando getOperando1() {
        return operando1;
    }

    public void setOperando1(Operando operando1) {
        this.operando1 = operando1;
    }

    public Operando getOperando2() {
        return operando2;
    }

    public void setOperando2(Operando operando2) {
        this.operando2 = operando2;
    }
    
    public void setOperandoResult(String nome){
        if(nome.equalsIgnoreCase("ADD")){ //Comparar uma String
            this.operandoResult = calcularOperandoSoma(operando1.getNum(), operando2.getNum());
        }else if(nome.equalsIgnoreCase("SUB")){
            this.operandoResult = calcularOperandoSub(operando1.getNum(), operando2.getNum());
        }else if(nome.equalsIgnoreCase("MULT")){
            this.operandoResult = calcularOperandoMult(operando1.getNum(), operando2.getNum());
        }else if(nome.equalsIgnoreCase("DIV")){
            this.operandoResult = calcularOperandoDiv(operando1.getNum(), operando2.getNum());
        }else{
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
    
    public int getoperandoResult(){
        return operandoResult;
    }
}