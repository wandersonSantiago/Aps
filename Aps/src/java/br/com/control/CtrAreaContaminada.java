/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.control;

import br.com.dao.DaoAreaContaminada;
import br.com.model.AreaContaminada;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Eduardo Ferrari
 */
public class CtrAreaContaminada {
    
    private DaoAreaContaminada acessoHibernatedepto;
    
    public CtrAreaContaminada ()
    {
       acessoHibernatedepto = new DaoAreaContaminada();
    }
    public boolean gravarAreaContaminada(AreaContaminada areaContaminada)
    {
       try
       {
           acessoHibernatedepto.gravar(areaContaminada);
	   return true;
       }catch(HibernateException e)
       {
           e.printStackTrace();
	   return false;
       }
       
    }
    public boolean excluirAreaContaminada(AreaContaminada areaContaminada)
    {
       try
       {
	   acessoHibernatedepto.excluir(areaContaminada);
	   return true;
       }catch(HibernateException e)
       {
         e.printStackTrace();
	 return false;
       }
	
    }
    public boolean alterarAreaContaminada(AreaContaminada areaContaminada)
    {
        try
	{
	   acessoHibernatedepto.alterar(areaContaminada);
	   return true;
	}catch(HibernateException e)
	{
	  e.printStackTrace();
	  return false;
	}
    }
    public List carregarAreaContaminada()
    {
        try
	{
	    return acessoHibernatedepto.carregarTudoOrdenado(AreaContaminada.class, "municipio");
	}catch(HibernateException e)
	{
	 e.printStackTrace();
	  return null;
	}
      
    }
    
}
