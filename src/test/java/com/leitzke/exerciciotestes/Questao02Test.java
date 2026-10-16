package com.leitzke.exerciciotestes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Questao02Test {

    @Test
    @DisplayName("Teste para retornar 'verão' caso o número passado seja 1")
    void deveRetornarVeraoQuandoNumeroFor1(){
        int num = 1;

        String estacao = Questao02.estacoesDoAno(num);

        Assertions.assertThat(estacao).isEqualTo("É verão e o tempo está quente.");
    }

    @Test
    @DisplayName("Teste para retornar 'outono' caso o número passado seja 2")
    void deveRetornarOutonoQuandoNumeroFor2(){
        int num = 2;

        String estacao = Questao02.estacoesDoAno(num);

        Assertions.assertThat(estacao).isEqualTo("É outono e as folhas estão caindo.");
    }

    @Test
    @DisplayName("Teste para retornar 'inverno' caso o número passado seja 3")
    void deveRetornarInvernoQuandoNumeroFor3(){
        int num = 3;

        String estacao = Questao02.estacoesDoAno(num);

        Assertions.assertThat(estacao).isEqualTo("É inverno e o tempo está frio.");
    }

    @Test
    @DisplayName("Teste para retornar 'primavera' caso o número passado seja 4")
    void deveRetornarPrimaveraQuandoNumeroFor4(){
        int num = 4;

        String estacao = Questao02.estacoesDoAno(num);

        Assertions.assertThat(estacao).isEqualTo("É primavera e as flores estão florindo.");
    }

    @Test
    @DisplayName("Teste para retornar exceção caso o número passado seja acima do limite")
    void deveLancarExcecaoQuandoNumeroForAcimaDoLimite(){
        int num = 5;
        Assertions.assertThatThrownBy(() -> Questao02.estacoesDoAno(num)).isInstanceOf(RuntimeException.class).hasMessage("Estação inválida");
    }

    @Test
    @DisplayName("Teste para retornar exceção caso o número passado seja abaixo do limite")
    void deveLancarExcecaoQuandoNumeroForAbaixoDoLimite(){
        int num = 0;
        Assertions.assertThatThrownBy(() -> Questao02.estacoesDoAno(num)).isInstanceOf(RuntimeException.class).hasMessage("Estação inválida");
    }
}
