package com.leitzke.exerciciotestes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Questao01Test {

    @Test
    @DisplayName("Teste para retornar true caso o número passado seja par")
    void deveRetornarTrueQuandoNumeroForPar(){
        double num = 8;

        boolean resultado = Questao01.validarNumero(num);

        Assertions.assertThat(resultado).isTrue();
    }

    @Test
    @DisplayName("Teste para retornar false caso o número passado seja ímpar")
    void deveRetornarFalseQuandoNumeroForImpar(){
        double num = 5;

        boolean resultado = Questao01.validarNumero(num);

        Assertions.assertThat(resultado).isFalse();
    }
}
