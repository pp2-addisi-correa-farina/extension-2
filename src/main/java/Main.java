import org.example.mock.LGAdapter;
import org.pp2.Dispositivo;
import org.pp2.DispositivoProxyFactory;

public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new LGAdapter();
        DispositivoProxyFactory proxyFactory = new DispositivoLoggerProxyFactory();
        Dispositivo dispositivoProxy = proxyFactory.crear(dispositivo);

        dispositivoProxy.ejecutar("APAGAR");
    }
}