package br.com.listrecyclerview01.model;

public class Cliente {
    //Variáveis
    private int     cod;
    private String  nome;

    //Construtor
    public Cliente(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    //GetterSetter (Alt + Insert)
    public int getCod() {return cod;}
    public void setCod(int cod) {this.cod = cod;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}
