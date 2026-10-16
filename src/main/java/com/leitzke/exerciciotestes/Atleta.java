package com.leitzke.exerciciotestes;

public class Atleta {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Atleta(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String classificarCategorias(){

        if (idade >=5 && idade <=7){
            return "pré-mirim";
        } else if(idade >=8 && idade <=10){
            return "mirim";
        } else if(idade >=11 && idade <=13){
            return "infantil";
        } else if(idade >=14 && idade <=17){
            return "infanto-juvenil";
        } else if(idade >=18 && idade <=20){
            return "juvenil";
        }  else if(idade >=21){
            return "adulto";
        } else {
            throw new RuntimeException("Idade inválida");
        }

    }

    public String classificarIMC(){
        double imc = peso/(altura*altura);

        if (imc < 18.5){
            return "magreza";
        } else if(imc >= 18.5 && imc <= 24.9){
            return "saudável";
        } else if(imc >= 25 && imc <= 29.9){
            return "sobrepeso";
        } else if(imc >= 30 && imc <= 34.9){
            return "obesidade grau I";
        } else if(imc >= 35 && imc <= 39.9){
            return "obesidade grau II";
        } else {
            return "obesidade grau III";
        }
    }
}
