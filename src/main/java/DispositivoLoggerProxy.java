import org.pp2.Dispositivo;

public class DispositivoLoggerProxy implements Dispositivo {

    private final Dispositivo dispositivo;

    public DispositivoLoggerProxy(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public String getNombre() {
        return dispositivo.getNombre();
    }

    @Override
    public void ejecutar(String comando) {
        System.out.printf("INFO - Se ejecuta comando %s%n", comando);
        dispositivo.ejecutar(comando);
    }
}
