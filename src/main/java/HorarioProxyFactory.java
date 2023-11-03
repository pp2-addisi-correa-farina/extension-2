import org.pp2.Dispositivo;
import org.pp2.DispositivoProxyFactory;
import time.LocalTimeService;
import time.ProdLocalTimeService;

public class HorarioProxyFactory implements DispositivoProxyFactory {

    private final static String PROD_ENV = "PROD";
    private final static int HORARIO_INICIO = 9;
    private final static int HORARIO_FIN = 23;

    @Override
    public Dispositivo crear(Dispositivo dispositivo) {
        return new HorarioProxy(dispositivo, HORARIO_INICIO, HORARIO_FIN, getLocalTimeService());
    }

    @Override
    public boolean esCandidato(Dispositivo dispositivo) {
        return true;
    }

    private LocalTimeService getLocalTimeService(){
        // FIXME: La lógica de determinar qué LocalTimeService utilizar NO debería estar acá.
        // Una opción es, al igual que los Dispositivos, utilizar un Plugin y cargar la clase
        // a utilizar en runtime.
//        String env = (String) properties.get("env");
//        if (PROD_ENV.equals(env))
//            return new ProdLocalTimeService();
//
//        return new TestLocalTimeService();
        return new ProdLocalTimeService();
    }

}
