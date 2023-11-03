package org.example.mock;
import org.pp2.Dispositivo;
import org.pp2.DispositivoObserver;

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

    @Override
    public void registrarObserver(DispositivoObserver observer) {
    }

    @Override
    public void eliminarObserver() {

    }
}
