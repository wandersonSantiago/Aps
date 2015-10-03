/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.control;

import br.com.dao.DaoUsuario;
import br.com.model.Usuario;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author CRC-TIC01
 */
public class CtrUsuario {
    
    private DaoUsuario acessoHibernatedepto;
    
    public CtrUsuario()
    {
     acessoHibernatedepto = new DaoUsuario();
    }
    
    public boolean gravarUsuario(Usuario usuario)
    {
       try
       {
	   acessoHibernatedepto.gravar(usuario);
	   return true;
       }catch(HibernateException e)
       {
	 e.printStackTrace();
         return false;
       }
    }
    public boolean alterarUsuario(Usuario usuario)
    {
       try
       {
	   acessoHibernatedepto.alterar(usuario);
	   return false;
       }catch(HibernateException e)
       {
         e.printStackTrace();
	 return false;
       }
    }
    public boolean excluirUsuario(Usuario usuario)
    {
       try
       {
	   acessoHibernatedepto.excluir(usuario);
	   return  true;
       }catch(HibernateException e)
       {
        e.printStackTrace();
	return false;
       }
    }
    public List carregarUsuario()
    {
        try
	{
	  return acessoHibernatedepto.carregarTudoOrdenado(Usuario.class,"usuario");
	  
	}catch(HibernateException e)
	{
	 e.printStackTrace();
	 return null;
	}
    }
}
