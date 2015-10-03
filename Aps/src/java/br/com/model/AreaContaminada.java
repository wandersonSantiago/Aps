/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

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
@Table(name="area_contaminada")
public class AreaContaminada {

    @Id
    @Column(unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 30)
    private String municipio;
    @Column(nullable = false,length = 30)
    private String atividade;
    @Column(nullable = false,length = 30)
    private String denominacoes;
    @Column(nullable = false,length = 30)
    private String endereco;
    @Column(nullable = false)
    private double coordX;
    @Column(nullable = false)
    private double coordY;
    @Column(nullable = false,length = 30)
    private String classificacao;
    @Column(nullable = false,length = 30)
    private String etapaGerenciamento;
    @Column(nullable = false,length = 30)
    private String meioImpactado;
    @Column(nullable = false,length = 30)
    private String contaminante;
    @Column(nullable = false)
    private boolean presencaFaselibre;
    @Column(nullable = false,length = 30)
    private String situacao;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getMunicipio() {
	return municipio;
    }

    public void setMunicipio(String municipio) {
	this.municipio = municipio;
    }

    public String getAtividade() {
	return atividade;
    }

    public void setAtividade(String atividade) {
	this.atividade = atividade;
    }

    public String getDenominacoes() {
	return denominacoes;
    }

    public void setDenominacoes(String denominacoes) {
	this.denominacoes = denominacoes;
    }

    public String getEndereco() {
	return endereco;
    }

    public void setEndereco(String endereco) {
	this.endereco = endereco;
    }

    public double getCoordX() {
	return coordX;
    }

    public void setCoordX(double coordX) {
	this.coordX = coordX;
    }

    public double getCoordY() {
	return coordY;
    }

    public void setCoordY(double coordY) {
	this.coordY = coordY;
    }

    public String getClassificacao() {
	return classificacao;
    }

    public void setClassificacao(String classificacao) {
	this.classificacao = classificacao;
    }

    public String getEtapaGerenciamento() {
	return etapaGerenciamento;
    }

    public void setEtapaGerenciamento(String etapaGerenciamento) {
	this.etapaGerenciamento = etapaGerenciamento;
    }

    public String getMeioImpactado() {
	return meioImpactado;
    }

    public void setMeioImpactado(String meioImpactado) {
	this.meioImpactado = meioImpactado;
    }

    public String getContaminante() {
	return contaminante;
    }

    public void setContaminante(String contaminante) {
	this.contaminante = contaminante;
    }

    public boolean isPresencaFaselibre() {
	return presencaFaselibre;
    }

    public void setPresencaFaselibre(boolean presencaFaselibre) {
	this.presencaFaselibre = presencaFaselibre;
    }

    public String getSituacao() {
	return situacao;
    }

    public void setSituacao(String situacao) {
	this.situacao = situacao;
    }
    
    
}
