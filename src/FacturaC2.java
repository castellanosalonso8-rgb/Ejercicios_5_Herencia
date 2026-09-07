import java.time.LocalDateTime;
import java.util.UUID;
import java.util.Date;
public class FacturaC2 {
    private UUID id;
    private LocalDateTime fecha;
    private ClienteC2 cliente;
    private double monto;

    public FacturaC2(){
        id = UUID.randomUUID();
        fecha = LocalDateTime.now();
    }
    public FacturaC2(ClienteC2 cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
        id = UUID.randomUUID();
        fecha = LocalDateTime.now();
    }
}
