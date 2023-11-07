import org.pp2.Dispositivo;
import org.pp2.DispositivoProxyFactory;

public class DispositivoLoggerProxyFactory implements DispositivoProxyFactory {

    @Override
    public Dispositivo crear(Dispositivo dispositivo) {
        return new DispositivoLoggerProxy(dispositivo);
    }

    @Override
    public boolean esCandidato(Dispositivo dispositivo) {
        return true;
    }

}
