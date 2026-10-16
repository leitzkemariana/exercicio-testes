package com.leitzke.exerciciotestes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    @DisplayName("Teste para retornar o nome em Star Wars")
    void deveFormarNomeQuandoInstanciarPessoa(){
        Pessoa pessoa = new Pessoa("Clara", "Bing", "Carla Lauisa", "Porto Alegra");

        String nomeStarWars = pessoa.gerarNome();

        Assertions.assertThat(nomeStarWars).isEqualTo("BinCl LaPor");
    }
}
