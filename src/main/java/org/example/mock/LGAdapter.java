package org.example.mock;
import org.pp2.Dispositivo;

public class LGAdapter implements Dispositivo {

    private final AireAcondicionadoLGMock aireAcondicionadoLGMock;

    public LGAdapter(){
        aireAcondicionadoLGMock = new AireAcondicionadoLGMock();

    }

    @Override
    public String getNombre() {
        return "d3";
    }

    @Override
    public void ejecutar(String comando) {
        switch (comando){
            case "APAGAR": {
                aireAcondicionadoLGMock.apagar();
            } break;
            case "ENCENDER": {
                aireAcondicionadoLGMock.encender();
            }
            break;
            default: throw new IllegalArgumentException("Comando inexistente");
        }
    }
}
