/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author lorran
 */
public class Proprietario {
    
    private int Id;
    private String nome;
    private String nomeDoMeio;
    private String sobrenome;
    private char sexo;
    private Date nascimento;
    private Image foto;
    private String email;
    private String telefone;
    private String endereco;
    private int ativo;

    public Proprietario() {
    }

    public Proprietario(String nome, String nomeDoMeio, String sobrenome, char sexo, Date nascimento, Image foto, String email, String telefone, String endereco, int ativo) {
        this.nome = nome;
        this.nomeDoMeio = nomeDoMeio;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.foto = foto;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.ativo = ativo;
    }

    public Proprietario(int Id, String nome, String nomeDoMeio, String sobrenome, char sexo, Date nascimento, Image foto, String email, String telefone, String endereco, int ativo) {
        this.Id = Id;
        this.nome = nome;
        this.nomeDoMeio = nomeDoMeio;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.foto = foto;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.ativo = ativo;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public char getSexo() {
        return sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public Image getFoto() {
        return foto;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
    
    
}
