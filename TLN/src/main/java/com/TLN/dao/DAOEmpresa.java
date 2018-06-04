
package com.TLN.dao;

import com.model.entidade.Empresa;

public interface DAOEmpresa extends DAOGenerico <Empresa>{
    
     public Empresa buscaporncpj (String cnpj);
    
    public Empresa buscaporNFantasia (String NFantasia);
}
