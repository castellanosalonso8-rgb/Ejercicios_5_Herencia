import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
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
                break;
            case 2:

                break;

            default:
                System.out.printf("Opcion invalida xxx");
        }
    }
}