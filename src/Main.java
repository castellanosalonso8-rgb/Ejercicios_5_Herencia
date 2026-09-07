import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese el ejercicio a realizar: ");
        switch (scan.nextInt()) {
            case 1:
                /*Ejecute las siguientes instrucciones:
1: Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
2: Imprima por pantalla al autor previamente instanciado.
3: Inicialice el libro “Efective Java” del Autor “Joshua Bloch” que cuesta 450 pesos con
una cantidad de 150 copias.
4: Imprima por pantalla el libro instanciado.
5: Modifique el precio del libro “Efective Java” a 500 pesos y aumente la cantidad en 50 copias.
6: Imprima por pantalla los atributos del Autor Joshua, accediendo desde el Libro “Efective Java”.
7: Agregue un método a la clase Libro que posibilite imprimir en pantalla el siguiente mensaje:
      “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.*/
                List<Autor> autores = new ArrayList<>();
                autores.add(new Autor("Joshua","Bloch","joshua@email.com",'M'));
                System.out.printf(autores.get(0).toString());
                List<Libro> libros = new ArrayList<>();
                libros.add(new Libro("Efective Java",450, 150,autores.get(0)));
                libros.get(0).setPrecio(500);
                libros.get(0).aumentarStock(50);
                System.out.printf(libros.get(0).toString());
                System.out.printf(libros.get(0).getAutor().toString());
                for(int i = 0; i< libros.size();i++) {
                    System.out.printf(libros.get(i).mostrarCiertosAtributos());
                }
                break;
            case 2:
  /* 2_Nos contratan para hacer un programa que lleve el control de las ventas de un local. Para esto es necesario modelar
  la clase Cliente, que posee un atributo id como identificador del cliente, el mismo debe ser un valor compuesto por letras
  y números aleatorios que se generan automáticamente al crear un Cliente. El Cliente también posee un nombre, un email y un
   porcentaje de descuento.
  Por otro lado vamos a tener el objeto Factura que representa una venta del local, cada Factura posee un identificador
  de las mismas características usadas en Cliente. A su vez cada factura posee un monto total, una fecha y el Cliente que
  generó la compra. Para la fecha de la venta se le va a asignar la fecha y hora al momento de creación del objeto Factura.
  El tipo Factura debe contar con un método que calcule el monto final luego de aplicarle el descuento que posee el cliente.
  Investigue la clase UUID y sus métodos estáticos para la generación de los ids.
  Investigue la clase LocalDateTime y sus métodos estáticos para la generación de la fecha.
 Cree un objeto de tipo Cliente, imprima sus detalles por pantalla. Para esto haga uso de un método que facilite la impresión
  del mismo. Cliente[id=?, nombre=?, email=?, descuento=?]
  Cree un objeto de tipo Factura que posea al Cliente anteriormente creado. Una vez hecho esto, imprima por pantalla el monto
  total de esta Factura y el monto total luego de aplicarle el descuento. e. Cree un método que facilite la impresión del
 objeto de tipo Factura y que siga el siguiente formato: Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,
  email=?, descuento=?]]*/

                break;

            default:
                System.out.printf("Opcion invalida xxx");
                System.out.println(UUID.randomUUID());
        }
    }
}