package estudos.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(23, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(jessica.eMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.eMaiorDeIdade());
    }
}
