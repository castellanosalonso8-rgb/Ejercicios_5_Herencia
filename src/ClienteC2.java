import java.util.UUID;

public class ClienteC2 {
    private String nombre;
    private double descuento;
    private String correo;
    private UUID id;

    public ClienteC2(){}
    public ClienteC2(String nombre, double descuento, String correo) {
        id = UUID.randomUUID();
        this.correo = correo;
        this.descuento = descuento;
        this.nombre = nombre;
    }
    public String getNombre() {return nombre;}
    public double getDescuento() {return descuento;}
    public String getCorreo() {return correo;}

    public void setDescuento(double descuento) {this.descuento = descuento;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCorreo(String correo) {this.correo = correo;}


}
