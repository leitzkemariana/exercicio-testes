package com.leitzke.exerciciotestes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ImpostoTest {

    @Test
    @DisplayName("Teste para retornar o 0% de imposto")
    void DeveRetornar0QuandoRendaAnualFor4000(){
        ImpostoDeRenda imposto = new ImpostoDeRenda("Laura", "1112223365", "SC", 4000);
        double impostoPago = imposto.calcacularImposto();

        Assertions.assertThat(impostoPago).isEqualTo(0.0);
    }

    @Test
    @DisplayName("Teste para retornar o 5,8% de imposto")
    void DeveCalcularImpostoDeCincoPontoOitoQuandoRendaAnualFor4001(){
        ImpostoDeRenda imposto = new ImpostoDeRenda("Laura", "1112223365", "SC", 4001);
        double impostoPago = imposto.calcacularImposto();

        Assertions.assertThat(impostoPago).isEqualTo(4001*0.058);
    }

    @Test
    @DisplayName("Teste para retornar o 5,8% de imposto")
    void DeveCalcularImpostoDeCincoPontoOitoQuandoRendaAnualFor9000(){
        ImpostoDeRenda imposto = new ImpostoDeRenda("Laura", "1112223365", "SC", 9000);
        double impostoPago = imposto.calcacularImposto();

        Assertions.assertThat(impostoPago).isEqualTo(9000*0.058);
    }

    @Test
    @DisplayName("Teste para retornar o 15% de imposto")
    void DeveCalcularImpostoDeQuinzeQuandoRendaAnualFor9001(){
        ImpostoDeRenda imposto = new ImpostoDeRenda("Laura", "1112223365", "SC", 9001);
        double impostoPago = imposto.calcacularImposto();

        Assertions.assertThat(impostoPago).isEqualTo(9001*0.15);
    }

    @Test
    @DisplayName("Teste para retornar o 15% de imposto")
    void DeveCalcularImpostoDeQuinzeQuandoRendaAnualFor25000(){
        ImpostoDeRenda imposto = new ImpostoDeRenda("Laura", "1112223365", "SC", 25000);
        double impostoPago = imposto.calcacularImposto();

        Assertions.assertThat(impostoPago).isEqualTo(25000*0.15);
    }

    @Test
    @DisplayName("Teste para retornar o 27,5% de imposto")
    void DeveCalcularImpostoDeVinteSetePontoCincoQuandoRendaAnualFor25001(){
        ImpostoDeRenda imposto = new ImpostoDeRenda("Laura", "1112223365", "SC", 25001);
        double impostoPago = imposto.calcacularImposto();

        Assertions.assertThat(impostoPago).isEqualTo(25001*0.275);
    }

    @Test
    @DisplayName("Teste para retornar o 27,5% de imposto")
    void DeveCalcularImpostoDeVinteSetePontoCincoQuandoRendaAnualFor35000(){
        ImpostoDeRenda imposto = new ImpostoDeRenda("Laura", "1112223365", "SC", 35000);
        double impostoPago = imposto.calcacularImposto();

        Assertions.assertThat(impostoPago).isEqualTo(35000*0.275);
    }

    @Test
    @DisplayName("Teste para retornar o 30% de imposto")
    void DeveCalcularImpostoDeTrintaQuandoRendaAnualForMaisDe35001(){
        ImpostoDeRenda imposto = new ImpostoDeRenda("Laura", "1112223365", "SC", 35001);
        double impostoPago = imposto.calcacularImposto();

        Assertions.assertThat(impostoPago).isEqualTo(35001*0.3);
    }

}
