package com.leitzke.exerciciotestes;

public class Questao02 {
    public static String estacoesDoAno (int num){
        if (num <= 0 || num >= 5){
            throw new RuntimeException("Estação inválida");
        }

        return switch (num){
            case 1 -> "É verão e o tempo está quente.";
            case 2 -> "É outono e as folhas estão caindo.";
            case 3 -> "É inverno e o tempo está frio.";
            case 4 -> "É primavera e as flores estão florindo.";
            default -> null;
        };
    }
}
