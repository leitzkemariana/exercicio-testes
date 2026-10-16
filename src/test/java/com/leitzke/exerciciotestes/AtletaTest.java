package com.leitzke.exerciciotestes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AtletaTest {

    @Test
    @DisplayName("Teste para retornar 'pré-mirim' caso a idade seja menor que 7")
    void deveRetornarPreMirimQuandoIdadeFor7(){
        Atleta atleta = new Atleta("Joana", 7, 1.60, 52);

        String resultado = atleta.classificarCategorias();

        Assertions.assertThat(resultado).isEqualTo("pré-mirim");
    }

    @Test
    @DisplayName("Teste para retornar 'mirim' caso a idade seja 8")
    void deveRetornarMirimQuandoIdadeFor8(){
        Atleta atleta = new Atleta("Joana", 8, 1.60, 52);

        String resultado = atleta.classificarCategorias();

        Assertions.assertThat(resultado).isEqualTo("mirim");
    }

    @Test
    @DisplayName("Teste para retornar 'mirim' caso a idade seja 10")
    void deveRetornarMirimQuandoIdadeFor10(){
        Atleta atleta = new Atleta("Joana", 10, 1.60, 52);

        String resultado = atleta.classificarCategorias();

        Assertions.assertThat(resultado).isEqualTo("mirim");
    }

    @Test
    @DisplayName("Teste para retornar 'infantil' caso a idade seja 11")
    void deveRetornarInfantilQuandoIdadeFor11(){
        Atleta atleta = new Atleta("Joana", 11, 1.60, 52);

        String resultado = atleta.classificarCategorias();

        Assertions.assertThat(resultado).isEqualTo("infantil");
    }

    @Test
    @DisplayName("Teste para retornar 'infantil' caso a idade seja 13")
    void deveRetornarInfantilQuandoIdadeFor13(){
        Atleta atleta = new Atleta("Joana", 13, 1.60, 52);

        String resultado = atleta.classificarCategorias();

        Assertions.assertThat(resultado).isEqualTo("infantil");
    }

    @Test
    @DisplayName("Teste para retornar 'infanto-juvenil' caso a idade seja 14")
    void deveRetornarInfantoJuvenilQuandoIdadeFor14(){
        Atleta atleta = new Atleta("Joana", 14, 1.60, 52);

        String resultado = atleta.classificarCategorias();

        Assertions.assertThat(resultado).isEqualTo("infanto-juvenil");
    }

    @Test
    @DisplayName("Teste para retornar 'infanto-juvenil' caso a idade seja 17")
    void deveRetornarInfantoJuvenilQuandoIdadeFor17(){
        Atleta atleta = new Atleta("Joana", 17, 1.60, 52);

        String resultado = atleta.classificarCategorias();

        Assertions.assertThat(resultado).isEqualTo("infanto-juvenil");
    }

    @Test
    @DisplayName("Teste para retornar 'juvenil' caso a idade seja 18")
    void deveRetornarJuvenilQuandoIdadeFor18(){
        Atleta atleta = new Atleta("Joana", 18, 1.60, 52);

        String resultado = atleta.classificarCategorias();

        Assertions.assertThat(resultado).isEqualTo("juvenil");
    }

    @Test
    @DisplayName("Teste para retornar 'juvenil' caso a idade seja 20")
    void deveRetornarJuvenilQuandoIdadeFor20(){
        Atleta atleta = new Atleta("Joana", 20, 1.60, 52);

        String resultado = atleta.classificarCategorias();

        Assertions.assertThat(resultado).isEqualTo("juvenil");
    }

    @Test
    @DisplayName("Teste para retornar 'adulto' caso a idade seja 21")
    void deveRetornarAdultoQuandoIdadeFor21(){
        Atleta atleta = new Atleta("Joana", 21, 1.60, 52);

        String resultado = atleta.classificarCategorias();

        Assertions.assertThat(resultado).isEqualTo("adulto");
    }

    @Test
    @DisplayName("Teste para lançar exceção caso a idade seja inválida")
    void deveLancarExcecaoQuandoIdadeForInvalida(){
        Atleta atleta = new Atleta("Joana", 0, 1.60, 52);

        Assertions.assertThatThrownBy(() -> atleta.classificarCategorias()).isInstanceOf(RuntimeException.class).hasMessage("Idade inválida");
    }

    @Test
    @DisplayName("Teste para retornar 'magreza' caso o IMC seja menor que 18,5")
    void deveRetornarMagrezaQuandoIMCForMenorQue18_5(){
        Atleta atleta = new Atleta("Joana", 10, 1.60, 40);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado).isEqualTo("magreza");
    }

    @Test
    @DisplayName("Teste para retornar 'saudável' caso o IMC seja menor que 25")
    void deveRetornarSaudavelQuandoIMCForMenorQue25(){
        Atleta atleta = new Atleta("Joana", 10, 1.60, 50);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado).isEqualTo("saudável");
    }

    @Test
    @DisplayName("Teste para retornar 'sobrepeso' caso o IMC seja menor que 30")
    void deveRetornarSobrepesoQuandoIMCForMenorQue30(){
        Atleta atleta = new Atleta("Joana", 10, 1.60, 70);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado).isEqualTo("sobrepeso");
    }

    @Test
    @DisplayName("Teste para retornar 'obesidade grau I' caso o IMC0 seja menor que 35")
    void deveRetornarObesidadeIQuandoIMCForMenorQue35(){
        Atleta atleta = new Atleta("Joana", 10, 1.60, 80);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado).isEqualTo("obesidade grau I");
    }

    @Test
    @DisplayName("Teste para retornar 'obesidade grau II' caso o IMC0 seja menor que 40")
        void deveRetornarObesidadeIIQuandoIMCForMenorQue40(){
        Atleta atleta = new Atleta("Joana", 10, 1.60, 90);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado).isEqualTo("obesidade grau II");
    }

    @Test
    @DisplayName("Teste para retornar 'obesidade grau III' caso o IMC0 seja maior que 40")
    void deveRetornarObesidadeIIIQuandoIMCForMaiorQue40(){
        Atleta atleta = new Atleta("Joana", 10, 1.60, 190);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado).isEqualTo("obesidade grau III");
    }
}
