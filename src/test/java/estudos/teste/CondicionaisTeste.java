package estudos.teste;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    @EnabledOnJre(JRE.JAVA_17)
    void validarAlgoUsuarioJoao() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
