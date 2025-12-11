
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//

import java.util.ArrayList;
import java.util.Scanner;

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor COMPLETAR


    public Coche() {
    }

    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    // Método acelerar (suma +10) COMPLETAR

    public void acelerar() {
        System.out.println("Acelerando...");
        this.velocidad += 10;
    }

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR

    public void frenar() {
        if (this.velocidad <= 0) {
            System.out.println("El coche ya se encuentra frenado del todo");
        } else {
            System.out.println("Frenando...");
            this.velocidad -= 10;
            if (this.velocidad < 0) {
                this.velocidad = 0;
            }
        }
    }

    // Método mostrarDatos COMPLETAR

    public void mostrarDatos() {
        System.out.printf("Marca: %s | Modelo: %s | Velocidad: %d%n", this.marca, this.modelo, this.velocidad);
    }

}

// Un Alumno tiene nombre y una lista de notas (ArrayList<Integer>)
// Implementa: añadirNota, calcularMedia, mostrarInfo.
// Deja todo lo necesario para que el alumno complete.

class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor COMPLETAR

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    // Método añadirNota COMPLETAR

    public void anyadirNota(Integer nota) {
        this.notas.add(nota);
    }

    // Método calcularMedia COMPLETAR

    public void calcularMedia() {
        if (this.notas.isEmpty()) {
            System.out.println("No se puede calcular media, el alumno no tiene notas");
        } else {
            Integer media = 0, contador = 0;
            for (Integer nota : this.notas) {
                media += nota;
                contador++;
            }
            media = media / contador;
            System.out.printf("Media: %d%n", media);
        }
    }

    // Método mostrarInfo COMPLETAR

    public void mostrarInfo () {
        System.out.println("Nombre: " + this.nombre);
        if (this.notas.isEmpty()) {
            System.out.println("No hay notas disponibles");
        } else {
            for (Integer nota : this.notas) {
                System.out.println("Nota: " + nota);
            }
        }
    }

}

// La CuentaBancaria debe tener titular, saldo y métodos
// ingresar(), retirar() y mostrarSaldo().
// Añade control para no permitir saldo negativo.
//

class CuentaBancaria {

    // atributos COMPLETAR

    private String titular;
    private double saldo;

    // constructor COMPLETAR

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    // método ingresar COMPLETAR

    public void ingresar(double dinero) {
        if (dinero > 0) {
            System.out.println("Ingresando ...");
            this.saldo += dinero;
        } else {
            System.out.println("No se puede ingresar esa cantidad de dinero");
        }
    }

    // método retirar COMPLETAR

    public void retirar(double dinero) {
        if (this.saldo < dinero){
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Retirando ...");
            this.saldo -= dinero;
        }
    }

    // método mostrarSaldo COMPLETAR

    public void mostrarSaldo() {
        System.out.printf("Cliente: %s | Saldo: %.2f",this.titular, this.saldo);
    }

}

// Clase Libro: titulo, autor, disponible.
// Clase Biblioteca: ArrayList<Libro>, métodos añadirLibro,
// prestarLibro(titulo), devolverLibro(titulo).
// Deja huecos para que lo desarrollen.

class Libro {

    // atributos COMPLETAR

    private String titulo;
    private String autor;
    private boolean disponible;

    // constructor COMPLETAR

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // método mostrarInfo COMPLETAR

    @Override
    public String toString() {
        String mensaje;
        if (this.disponible) {
            mensaje = "disponible";
        } else {
            mensaje = "no disponible";
        }
        return String.format("Titulo: %s | Autor: %s | Disponibilidad: %s", this.titulo, this.autor, mensaje);
    }
}

class Biblioteca {

    private ArrayList<Libro> libros = new ArrayList<>();

    // lista de libros COMPLETAR

    public void listarLibros() {
        if (this.libros.isEmpty()) {
            System.out.println("No hay libros que mostrar");
        } else  {
            for (Libro libro : this.libros) {
                System.out.println(libro);
            }
        }
    }

    // añadirLibro COMPLETAR

    public void anyadirLibro(Libro libro) {
        this.libros.add(libro);
    }

    // prestarLibro COMPLETAR


    // devolverLibro COMPLETAR

}

// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().

class Producto {

    // atributos COMPLETAR


    // constructor COMPLETAR


    // getters opcionales COMPLETAR

}

class Carrito {

    // lista de productos COMPLETAR


    // añadirProducto COMPLETAR


    // calcularTotal COMPLETAR


}

// El main está vacío para que cada alumno pruebe los ejercicios
// que quiera. Pueden crear objetos y llamar métodos.

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1: Coche
        // Enunciado:
        //   - Crear un coche con marca y modelo.
        //   - Llamar varias veces a acelerar() y frenar().
        //   - Mostrar los datos finales del coche.

        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.

        // EJERCICIO 3: Cuenta Bancaria
        // Enunciado:
        //   - Crear una cuenta bancaria con titular y saldo inicial.
        //   - Ingresar una cantidad.
        //   - Retirar otra cantidad.
        //   - Intentar retirar más de lo disponible (debe impedirse).
        //   - Mostrar el saldo final.

        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.

        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

    }
}