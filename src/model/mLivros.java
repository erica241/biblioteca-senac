/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author erica.matos1
 */
public class mLivros {
    
    private int id_livro;
    private String título;
    private String descriçao;
    private int ano;
    private mEditoras editora;
    private mAutores autores;

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public mEditoras getEditora() {
        return editora;
    }

    public void setEditora(mEditoras editora) {
        this.editora = editora;
    }

    public mAutores getAutores() {
        return autores;
    }

    public void setAutores(mAutores autores) {
        this.autores = autores;
    }
    
    
    
}
