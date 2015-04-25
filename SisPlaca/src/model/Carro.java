/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author lorran
 */
public class Carro {
    
    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ativo;
    private byte[] foto;
    private ArrayList<Proprietario> proprietarios;

    
    
    public Carro(String placa, String marca, String modelo, String cor, int ativo, byte[] foto, ArrayList<Proprietario> proprietarios) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ativo = ativo;
        this.foto = foto;
        this.proprietarios = proprietarios;
    }

    public Carro(int id, String placa, String marca, String modelo, String cor, int ativo, byte[] foto, ArrayList<Proprietario> proprietarios) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ativo = ativo;
        this.foto = foto;
        this.proprietarios = proprietarios;
    }

    public Carro() {
        this.proprietarios = new ArrayList<>();
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public ArrayList<Proprietario> getProprietarios() {
        return proprietarios;
    }

    public void setProprietarios(ArrayList<Proprietario> proprietarios) {
        this.proprietarios = proprietarios;
    }
    
}