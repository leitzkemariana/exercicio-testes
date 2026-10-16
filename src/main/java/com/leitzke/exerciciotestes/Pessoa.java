package com.leitzke.exerciciotestes;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String nomeMae;
    private String cidade;

    public Pessoa(String nome, String sobrenome, String nomeMae, String cidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeMae = nomeMae;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String gerarNome(){
        String nome = this.sobrenome.substring(0,3) + this.nome.substring(0,2);
        String[] nomesMae = this.nomeMae.split(" ");
        String sobrenome = nomesMae[1].substring(0,2) + this.cidade.substring(0,3);

        return nome + " " + sobrenome;
    }

}
