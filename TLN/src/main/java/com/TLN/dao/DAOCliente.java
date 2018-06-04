package com.TLN.dao;

import com.model.entidade.Cliente;


public interface DAOCliente extends DAOGenerico <Cliente> {
    
    public Cliente buscaporcpf (String cpf);
    
    public Cliente buscaporNome (String Nome);
}
