
package com.model.entidade;


public class Passagem {
    
    private int cod_pass;
    
    private String check_in;
    
    private double preco;
  
    
    public Passagem (int cod_pass, String check_in, double preco){
        
        this.check_in = check_in;
        this.cod_pass = cod_pass;
        this.preco = preco;
    }

    public int getCod_pass() {
        return cod_pass;
    }

    public void setCod_pass(int cod_pass) {
        this.cod_pass = cod_pass;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
