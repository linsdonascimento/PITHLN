
package com.model.entidade;

public class Cliente {
    
    private String Nome;
    private String email;
    private String cpf;
    private int identidade;
    private String DTNasc;

    public Cliente(String Nome, String email, String cpf, int identidade, String DataNascimento) {
        this.Nome = Nome;
        this.email = email;
        this.cpf = cpf;
        this.identidade = identidade;
        this.DTNasc = DataNascimento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdentidade() {
        return identidade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    public String getDTNasc() {
        return DTNasc;
    }

    public void setDTNasc(String DataNascimento) {
        this.DTNasc = DataNascimento;
    }
    
   
    
}
