package padroescriacao.singleton;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String qrCode;
    private String usuarioAutenticado;

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(String usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }
}
