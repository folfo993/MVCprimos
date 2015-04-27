/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar;

import java.util.ArrayList;

/**
 *
 * @author oquintansocampo
 */
public class Modelo {

    private int digitos;
    private ArrayList<Integer> listaP = new ArrayList<Integer>();

    public Modelo() {
    }

    public Modelo(int digitos, ArrayList<Integer> listaP) {
        this.digitos = digitos;
        this.listaP = listaP;
    }

    public int getDigitos() {
        return digitos;
    }

    public void setDigitos(int digitos) {
        this.digitos = digitos;
    }

    public ArrayList<Integer> getListaP() {
        return listaP;
    }

    public void setListaP(ArrayList<Integer> listaP) {
        this.listaP = listaP;
    }

    public void add(int valor) {
        listaP.add(valor);
    }

}
