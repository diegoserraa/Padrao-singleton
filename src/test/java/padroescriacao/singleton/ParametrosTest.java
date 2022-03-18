package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarEnderecoQrCode() {
        Parametros.getInstance().setQrCode("https:clinica/ordem/1");
        assertEquals("https:clinica/ordem/1", Parametros.getInstance().getQrCode());
    }

    @Test
    public void deveRetornarUsuarioAutenticado() {
        Parametros.getInstance().setUsuarioAutenticado("Diego");
        assertEquals("Diego", Parametros.getInstance().getUsuarioAutenticado());
    }

}