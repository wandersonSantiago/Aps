/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

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
    private String usuario;
    private String senha;
    private String senhaR;
    private String email;
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

    public String getSenha() {
	return senha;
    }

    public void setSenha(String senha) {
	this.senha = senha;
    }

    public String getSenhaR() {
	return senhaR;
    }

    public void setSenhaR(String senhaR) {
	this.senhaR = senhaR;
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
    
    
    
}
