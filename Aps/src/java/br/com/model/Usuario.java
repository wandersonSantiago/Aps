/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPTemplate;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Eduardo Ferrari
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    @Id
    @Column(unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 50)
    private String usuario;
    @Column(nullable = false,length = 10)
    private byte[] digital;
    @Column(nullable = false,length = 50)
    private String email;
    @Column(nullable = false,length = 2)
    private int nivel;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getUsuario() {
	return usuario;
    }

    public void setUsuario(String usuario) {
	this.usuario = usuario;
    }


    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public int getNivel() {
	return nivel;
    }

    public void setNivel(int nivel) {
	this.nivel = nivel;
    }
    public  DPFPTemplate getDigital()
    {
     return DPFPGlobal.getTemplateFactory().createTemplate(this.digital);
    }
    public void setDigital(DPFPTemplate digital)
    {
     this.digital = digital.serialize();
    }
	     
	    
    @Override
    public String toString()
    {
      return usuario;
    }
    
    
}
