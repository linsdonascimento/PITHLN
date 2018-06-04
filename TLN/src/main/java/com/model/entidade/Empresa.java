
package com.model.entidade;


public class Empresa {
    
    private String NFantasia;
    private String cnpj;
    private String email;
    private String endereco;

    public Empresa(String NFantasia, String cnpj, String email, String endereco) {
        this.NFantasia = NFantasia;
        this.cnpj = cnpj;
        this.email = email;
        this.endereco = endereco;
    }

    /**
     * @return the NFantasia
     */
    public String getNFantasia() {
        return NFantasia;
    }

    /**
     * @param NFantasia the NFantasia to set
     */
    public void setNFantasia(String NFantasia) {
        this.NFantasia = NFantasia;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
