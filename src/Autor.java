public class Autor {
    private String nombre;
    private String apellido;
    private String gmail;
    private char genero;

    public Autor(String nombre, String apellido, String gmail, char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.gmail = gmail;
        this.genero = genero;
    }
    public char getGenero() {return genero;}
    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public String getGmail() {return gmail;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setGenero(char genero) {this.genero = genero;}
    public void setGmail(String gmail) {this.gmail = gmail;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    @Override
    public String toString() {
    return ": "+getNombre()+", Apellido: "+getApellido()+", Gmail: "+getGmail()+", Genero: "+getGenero()+"\n";
    }
}
