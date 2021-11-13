package br.edu.ifsul.cc.lpoo.cs.model.dao;

/**
 *
 * @author huriel
 */
public interface InterfacePersistencia {
    
    public Boolean conexaoAberta();
    
    public void fecharConexao();
    
}