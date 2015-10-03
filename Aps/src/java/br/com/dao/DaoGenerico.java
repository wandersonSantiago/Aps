/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;


import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Eduardo Ferrari
 */
public class DaoGenerico {
    
    public DaoGenerico()
    {
     
    }
    public void gravar(Object obj) throws HibernateException
    {
      /*  Session session = hibernateConfiguracao.openSession();
       Transaction transaction = session.beginTransaction();
       session.save(obj);
       transaction.commit();
       session.close();*/
    
    } 
    public void alterar(Object obj) throws HibernateException
    {
       /*
       Session session = hibernateConfiguracao.openSession();
       Transaction transaction = session.beginTransaction();
       session.update(obj);
       transaction.commit();
       session.close();*/
    }
    public void excluir(Object obj) throws HibernateException
    {
        /*
	Session session = hibernateConfiguracao.openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();*/
    }
    public List carregarTudoOrdenado(Class clas,String ordem) throws HibernateException
    {
        /*Session session = hibernateConfiguracao.openSession();
	Criteria criteria = session.createCriteria(clas);
	criteria.addOrder(Order.asc(ordem));
	List list = criteria.list();
	return list;*/
	return null;
    }
    public Object carregarUm(int id,Class<?>clas) throws HibernateException 
    {
       /*Session sessiong = hibernateConfiguracao.openSession();
       Transaction transaction = sessiong.beginTransaction();
       Criteria criteria = sessiong.createCriteria(clas);
       criteria.add(Restrictions.eq("id",id));
       Object obj = criteria.uniqueResult();
       transaction.commit();
       sessiong.close();
       return obj;*/
	return null;
    }
	    
}
