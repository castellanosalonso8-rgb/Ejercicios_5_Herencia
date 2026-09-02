public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro(String titulo, double precio, int stock, Autor autor){
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }
    public void setPrecio(double precio) {this.precio = precio;}
    public void setStock(int stock) {this.stock = stock;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public void setAutor(Autor autor) {this.autor = autor;}

    public double getPrecio() {return precio;}
    public int getStock() {return stock;}
    public String getTitulo() {return titulo;}
    public Autor getAutor() {return autor;}

    public void aumentarStock(int stock){
        this.stock = this.stock + stock;
    }

    @Override
    public String toString() {
       return "El titulo es: "+getTitulo()+", Precio: "+getPrecio()+", Stock: "+getStock()+", Del Autor: "+autor.getNombre()+" "+autor.getApellido();
    }
}
