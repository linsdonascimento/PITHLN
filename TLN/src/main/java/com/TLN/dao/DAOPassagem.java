
package com.TLN.dao;


import com.model.entidade.Passagem;

public interface DAOPassagem extends DAOGenerico <Passagem>{
    
     public Passagem buscarporcod_pass(int cod_pass);
    
     public Passagem buscarporcheck_in (String check_in);
     
     public Passagem buscarporpreco (double preco);
    
}
