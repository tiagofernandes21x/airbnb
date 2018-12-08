/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnb;

/**
 *
 * @author USER
 */
public class Owner {
    private String nome; 
    private String morada; 
    private int nif; 

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * @return the nif
     */
    public int getNif() {
        return nif;
    }

    /**
     * @param nif the nif to set
     */
    public void setNif(int nif) {
        this.nif = nif;
    }
    
}
