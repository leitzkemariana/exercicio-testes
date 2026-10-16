package com.leitzke.exerciciotestes;

public class ImpostoDeRenda {
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public ImpostoDeRenda(String nome, String cpf, String uf, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double calcacularImposto(){
        if (this.rendaAnual <= 4000){
            return 0.0;
        } else if (this.rendaAnual>4000 && this.rendaAnual<=9000) {
            return this.rendaAnual * 0.058;
        } else if (this.rendaAnual>9000 && this.rendaAnual<=25000) {
            return this.rendaAnual * 0.15;
        } else if (this.rendaAnual>25000 && this.rendaAnual<=35000) {
            return this.rendaAnual * 0.275;
        } else {
            return this.rendaAnual * 0.3;
        }
    }
}
