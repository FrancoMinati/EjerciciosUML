package org.franco.Poligonos;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.franco.FiguraBase;
import org.franco.Lado;
import org.franco.Punto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
public class Poligono extends FiguraBase {

    private List<Lado> lados;
    private int cantidadDeLados;
    public Poligono(int cantidadDeLados) {
        super();
        this.cantidadDeLados = cantidadDeLados;
        this.lados = generarLados();

    }
    public List<Lado> generarLados() {

        List<Lado> lados = new ArrayList<>();
        for (int i = 0; i < cantidadDeLados; i++) {
            System.out.println("Lado "+(i+1));
            double xInicio =obtenerDoubleDesdeConsola("Ingrese X1: ");
            double yInicio = obtenerDoubleDesdeConsola("Ingrese Y1: ");
            double xFin = obtenerDoubleDesdeConsola("Ingrese X2: ");
            double yFin = obtenerDoubleDesdeConsola("Ingrese Y2: ");
            System.out.println("-----------------------------------");
            lados.add(new Lado(xInicio, yInicio, xFin, yFin));
        }
        if (lados.size() < 3) {
            throw new IllegalArgumentException("El polígono debe tener al menos 3 puntos.");
        }
        return lados;
    }
    private double obtenerDoubleDesdeConsola(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        for (Lado lado : lados) {
            perimetro += lado.getLongitud();
        }
        return perimetro;
    }
}
