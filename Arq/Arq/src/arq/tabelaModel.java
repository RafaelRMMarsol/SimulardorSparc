/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arq;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import instrucao.Instrucao;


/**
 *
 * @author josel
 */
public class tabelaModel extends AbstractTableModel{

    private ArrayList<Instrucao> reg;
    private String colunas[] = {"Instrução", "AE30", "AE40", "AE50"};

    public tabelaModel(ArrayList<Instrucao> reg) {
        this.reg = reg;
    }
    
    @Override
    public int getRowCount() {
        return this.reg.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Instrucao a = this.reg.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return a.getNome();
            case 1:
                return a.getOperando1().getNum();
            case 2:
                return a.getOperando2().getNum();
            case 3:
                return a.getoperandoResult();
            default:
                break;
        }
        return null;
    }
    
}
