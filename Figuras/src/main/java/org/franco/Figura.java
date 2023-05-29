package org.franco;

import lombok.Getter;
import lombok.Setter;
import org.franco.Elipses.Circulo;
import org.franco.Elipses.Elipse;
import org.franco.Poligonos.Cuadrado;
import org.franco.Poligonos.Rectangulo;
import org.franco.Poligonos.Triangulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Figura {

    List<FiguraBase> componentesDeLaFigura;

    public Figura(){
     this.componentesDeLaFigura=generarFiguras();
    }

    public List<FiguraBase> generarFiguras() {
        List<FiguraBase> figuras = new ArrayList<>();

        int opcion=0;
        while (opcion!=6){
            System.out.println("Seleccione el tipo de figura a crear:");
            System.out.println("1. Elipse");
            System.out.println("2. Círculo");
            System.out.println("3. Rectángulo");
            System.out.println("4. Cuadrado");
            System.out.println("5. Triángulo");
            System.out.println("6. Salir");

            opcion = obtenerEnteroDesdeConsola("Ingrese su opción: ");

            switch (opcion) {
                case 1:
                    figuras.add(crearElipse());
                    break;
                case 2:
                    figuras.add(crearCirculo());
                    break;
                case 3:
                    figuras.add(crearRectangulo());
                    break;
                case 4:
                    figuras.add(crearCuadrado());
                    break;
                case 5:
                    figuras.add(crearTriangulo());
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        }

        return figuras;
    }

    private Elipse crearElipse() {
        double radioMayor = obtenerDoubleDesdeConsola("Ingrese el radio mayor de la elipse: ");
        double radioMenor = obtenerDoubleDesdeConsola("Ingrese el radio menor de la elipse: ");
        return new Elipse(radioMayor, radioMenor);
    }

    private Circulo crearCirculo() {
        double radio = obtenerDoubleDesdeConsola("Ingrese el radio del círculo: ");
        return new Circulo(radio);
    }

    private Rectangulo crearRectangulo() {
        return new Rectangulo();
    }

    private Cuadrado crearCuadrado() {
        return new Cuadrado();
    }

    private Triangulo crearTriangulo() {
        return new Triangulo();
    }

    private int obtenerEnteroDesdeConsola(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    private double obtenerDoubleDesdeConsola(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public void mostrarFiguras() {
        System.out.println("Figuras creadas:");

        for (int i = 0; i < componentesDeLaFigura.size(); i++) {
            FiguraBase figura = componentesDeLaFigura.get(i);
            System.out.println("Figura #" + (i + 1));
            System.out.println("Tipo: " + figura.getClass().getSimpleName());
            System.out.println("----------------------");
        }
    }


}
