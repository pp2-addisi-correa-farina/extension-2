import org.example.mock.LGAdapter;
import org.pp2.Dispositivo;
import org.pp2.DispositivoProxyFactory;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Dispositivo dispositivo = new LGAdapter();
        DispositivoProxyFactory proxyFactory = new HorarioProxyFactory();
        Dispositivo dispositivoProxy = proxyFactory.crear(dispositivo);

        dispositivoProxy.ejecutar("APAGAR");
    }
}